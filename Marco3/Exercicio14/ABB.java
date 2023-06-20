package Marco3.Exercicio14;

public class ABB {

    /**
     * @attribute raiz - Raiz da árvore
     */
    private Noh raiz;

    /**
     * @method ABB - Construtor da classe
     */
    public ABB() {
        raiz = null;
    }

    /**
     * @method getRaiz - Retorna a raiz da árvore
     * @return raiz - Raiz da árvore
     */
    public Noh getRaiz() {
        return raiz;
    }

    /**
     * @method isEmpty - Verifica se a árvore está vazia
     * @return true - Se a árvore estiver vazia | false - Se a árvore não estiver vazia
     */
    public boolean isEmpty() {
        return this.raiz == null;
    }

    /**
     * @method add - Adiciona um elemento na árvore
     * @param element - Elemento a ser adicionado
     */
    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();
                } else {
                    if (aux.getDir() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                }
            }
        } 
    }


    /**
     * @method recursiveAdd - Adiciona um elemento na árvore de forma recursiva
     * @param element - Elemento a ser adicionado
     */
    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    /**
     * @method recursiveAdd - Adiciona um elemento na árvore de forma recursiva
     * @param node - Nó atual
     * @param element - Elemento a ser adicionado 
     */
    private void recursiveAdd(Noh node, int element) {
        if (element < node.getValor()) {
            if (node.getEsq() == null) {
                Noh novoNoh = new Noh(element);
                node.setEsq(novoNoh);
                novoNoh.setPai(node);
                return;
            }
            recursiveAdd(node.getEsq(), element);
        } else {
            if (node.getDir() == null) {
                Noh novoNoh = new Noh(element);
                node.setDir(novoNoh);
                novoNoh.setPai(node);
                return;
            }
            recursiveAdd(node.getDir(), element);
        }
    }


    /**
     * @method search - Busca um elemento na árvore
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    public boolean search(int element) {
        if (isEmpty()) {
            return false;
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element == aux.getValor()) {
                    return true;
                } else if (element < aux.getValor()) {
                    aux = aux.getEsq();
                } else {
                    aux = aux.getDir();
                }
            }
            return false;
        }
    }

    /**
     * @method recursiveSearch - Busca um elemento na árvore de forma recursiva
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    public boolean recursiveSearch(int element) {
        if (isEmpty()) {
            return false;
        } else {
            return recursiveSearch(this.raiz, element);
        }
    }

    /**
     * @method recursiveSearch - Busca um elemento na árvore de forma recursiva
     * @param node - Nó atual
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    private boolean recursiveSearch(Noh node, int element) {
        if (node == null) {
            return false;
        } else if (element == node.getValor()) {
            return true;
        } else if (element < node.getValor()) {
            return recursiveSearch(node.getEsq(), element);
        } else {
            return recursiveSearch(node.getDir(), element);
        }
    }

    /**
     * @method imprimePreOrdem - Imprime a árvore em pré-ordem
     */
    public void imprimePreOrdem() {
        if (isEmpty()) {
            System.out.println("Árvore vazia!");
        } else {
            imprimePreOrdem(this.raiz);
        }
    }

    /**
     * @method imprimePreOrdem - Imprime a árvore em pré-ordem
     * @param node - Nó atual
     */
    public void imprimePreOrdem(Noh node) {
        if (node != null) {
            System.out.print(node.getValor() + " ");
            imprimePreOrdem(node.getEsq());
            imprimePreOrdem(node.getDir());
        }
    }



}
