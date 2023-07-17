package Marco3.Exercicio16;

public class AVL {

    private Noh raiz;

    public AVL() {
    }

    public Noh getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Noh raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public void adicionar(int info, Noh noAtual) {
        if (estaVazia()) {
            Noh novoNoh = new Noh(info);
            raiz = novoNoh;
            ajustarBalanceamento(raiz);
        } else {
            if (info < noAtual.getInfo()) {
                if (noAtual.getEsquerda() != null) {
                    adicionar(info, noAtual.getEsquerda());
                } else {
                    Noh novoNoh = new Noh(info);
                    noAtual.setEsquerda(novoNoh);
                    novoNoh.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balancear(raiz);
                }
            } else if (info > noAtual.getInfo()) {
                if (noAtual.getDireita() != null) {
                    adicionar(info, noAtual.getDireita());
                } else {
                    Noh novoNoh = new Noh(info);
                    noAtual.setDireita(novoNoh);
                    novoNoh.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balancear(raiz);
                }
            } else {
                System.out.println("Caso de nó repetido!");
            }
        }
    }

    public void ajustarBalanceamento(Noh noAtual) {
        noAtual.setFatorBalanceamento(verificarAltura(noAtual.getEsquerda()) - verificarAltura(noAtual.getDireita()));
        if (noAtual.getDireita() != null) {
            ajustarBalanceamento(noAtual.getDireita());
        }
        if (noAtual.getEsquerda() != null) {
            ajustarBalanceamento(noAtual.getEsquerda());
        }
    }

    public int verificarAltura(Noh noAtual) {
        if (noAtual == null) {
            return -1;
        }
        if (noAtual.getDireita() == null && noAtual.getEsquerda() == null) {
            return 0;
        } else if (noAtual.getEsquerda() == null) {
            return 1 + verificarAltura(noAtual.getDireita());
        } else if (noAtual.getDireita() == null) {
            return 1 + verificarAltura(noAtual.getEsquerda());
        } else {
            if (verificarAltura(noAtual.getEsquerda()) > verificarAltura(noAtual.getDireita())) {
                return 1 + verificarAltura(noAtual.getEsquerda());
            } else {
                return 1 + verificarAltura(noAtual.getDireita());
            }
        }
    }

    public Noh balancear(Noh noAtual) {
        if (noAtual.getFatorBalanceamento() == 2 && noAtual.getEsquerda().getFatorBalanceamento() >= 0) {
            noAtual = rotacaoADireita(noAtual);

        } else if (noAtual.getFatorBalanceamento() == -2 && noAtual.getDireita().getFatorBalanceamento() <= 0) {
            noAtual = rotacaoAEsquerda(noAtual);

        } else if (noAtual.getFatorBalanceamento() == 2 && noAtual.getEsquerda().getFatorBalanceamento() < 0) {
            noAtual = rotacaoDuplaDireita(noAtual);

        } else if (noAtual.getFatorBalanceamento() == -2 && noAtual.getDireita().getFatorBalanceamento() > 0) {
            noAtual = rotacaoDuplaEsquerda(noAtual);
        }

        if (noAtual.getDireita() != null) {
            balancear(noAtual.getDireita());
        }
        if (noAtual.getEsquerda() != null) {
            balancear(noAtual.getEsquerda());
        }
        return noAtual;
    }

    public Noh rotacaoADireita(Noh noAtual) {
        Noh aux = noAtual.getEsquerda();
        aux.setPai(noAtual.getPai());
        if (aux.getDireita() != null) {
            aux.getDireita().setPai(noAtual);
        }
        noAtual.setPai(aux);
        noAtual.setEsquerda(aux.getDireita());
        aux.setDireita(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDireita() == noAtual) {
                aux.getPai().setDireita(aux);
            } else if (aux.getPai().getEsquerda() == noAtual) {
                aux.getPai().setEsquerda(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Noh rotacaoAEsquerda(Noh noAtual) {
        Noh aux = noAtual.getDireita();
        aux.setPai(noAtual.getPai());
        if (aux.getEsquerda() != null) {
            aux.getEsquerda().setPai(noAtual);
        }

        noAtual.setPai(aux);
        noAtual.setDireita(aux.getEsquerda());
        aux.setEsquerda(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDireita() == noAtual) {
                aux.getPai().setDireita(aux);
            } else if (aux.getPai().getEsquerda() == noAtual) {
                aux.getPai().setEsquerda(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Noh rotacaoDuplaDireita(Noh noAtual) {
        Noh aux = noAtual.getEsquerda();
        noAtual.setEsquerda(rotacaoAEsquerda(aux));
        Noh aux2 = rotacaoADireita(noAtual);
        return aux2;
    }

    public Noh rotacaoDuplaEsquerda(Noh noAtual) {
        Noh aux = noAtual.getDireita();
        noAtual.setDireita(rotacaoADireita(aux));
        Noh aux2 = rotacaoAEsquerda(noAtual);
        return aux2;
    }

    public boolean arvoreBalanceada(Noh noAtual) {
        if (noAtual == null) {
            return true;
        }
        if (noAtual.getFatorBalanceamento() > 1 || noAtual.getFatorBalanceamento() < -1) {
            return false;
        }
        return arvoreBalanceada(noAtual.getEsquerda()) && arvoreBalanceada(noAtual.getDireita());
    }

    public void imprimirArvore(Noh noAtual, String espacos) {
        if (noAtual != null) {
            System.out.println(espacos + noAtual.getInfo());
            imprimirArvore(noAtual.getEsquerda(), espacos + "  ");
            imprimirArvore(noAtual.getDireita(), espacos + "  ");
        }
    }
}
