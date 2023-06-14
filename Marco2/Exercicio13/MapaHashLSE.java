package Marco2.Exercicio13;

public class MapaHashLSE {

    /**
     * @attribute vetorLista - vetor de listas de alunos
     */
    private LSE[] vetorLista;
    /**
     * @attribute sondagem - número de sondagens
     */
    int sondagem = 0;

    /**
     * Construtor da classe MapaHashLSE
     */
    public MapaHashLSE() {
        this.vetorLista = new LSE[5];
    }

    /**
     * Retorna o hash da chave
     * 
     * @param chave - chave do aluno
     * @return hash da chave
     */
    private int hash(int chave) {
        return chave % this.vetorLista.length;
    }

    /**
     * Insere o aluno no vetor de listas
     * 
     * @param chave - matrícula do aluno
     * @param valor - aluno a ser inserido
     */
    public void put(int chave, Aluno valor) {
        this.verificaTamanho(chave);
        while (sondagem < vetorLista.length) {
            int hash = (hash(chave) + sondagem) % vetorLista.length;
            LSE alunos_lista = this.vetorLista[hash];
            if (alunos_lista == null) {
                alunos_lista = new LSE();
                alunos_lista.insereInicio(valor);
                this.vetorLista[hash] = alunos_lista;
            } else {
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    if (n.getInfo().getMatricula() == chave) {
                        n.setInfo(valor);
                        return;
                    }
                }
                alunos_lista.insereInicio(valor);
            }
        }
        sondagem++;
    }

    /**
     * Retorna o aluno com a chave passada
     * 
     * @param chave - chave do aluno
     * @return aluno com a chave passada
     */
    public Aluno get(int chave) {
        int hash = (hash(chave) + sondagem) % vetorLista.length;
        if (this.vetorLista[hash] == null) {
            return null;
        } else {
            for (Noh n = this.vetorLista[hash].getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    return n.getInfo();
                }
            }
        }
        return null;
    }

    /**
     * Remove um aluno
     * 
     * @param chave - matricula do aluno
     */
    public Aluno remove(int chave) {
        int hash = (hash(chave) + sondagem) % vetorLista.length;
        LSE alunos = this.vetorLista[hash];
        if (alunos == null) {
            return null;
        } else if (alunos.getInicio().getProximo() == null && alunos.getInicio().getInfo().getMatricula() == chave) {
            this.vetorLista[hash] = null;
        } else {
            for (Noh n = alunos.getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    alunos.remove(n.getInfo());
                    break;
                }
            }
        }
        return null;
    }

    /**
     * Verifica se o vetor está sendo preenchido no último elemento
     * 
     * @param chave - chave do aluno
     */
    public void verificaTamanho(int chave) {
        int hash = (hash(chave) + sondagem) % vetorLista.length;

        if (hash == vetorLista.length - 1) {
            reSize();
        }

    }

    /**
     * Redimensiona o vetor
     */
    public void reSize() {
        LSE[] novoVetor = new LSE[this.vetorLista.length * 2];

        for (int i = 0; i < this.vetorLista.length; i++) {
            novoVetor[i] = this.vetorLista[i];
        }

        this.vetorLista = novoVetor;
        reHash();

    }

    /**
     * Reorganiza o vetor
     */
    public void reHash() {
        for (int i = 0; i < this.vetorLista.length; i++) {
            if (this.vetorLista[i] != null) {
                for (Noh n = this.vetorLista[i].getInicio(); n != null; n = n.getProximo()) {
                    remove(n.getInfo().getMatricula());
                    put(n.getInfo().getMatricula(), n.getInfo());
                }
            }
        }
    }

    /**
     * Retorna o vetor de listas
     * 
     * @return vetor de listas
     */
    public LSE[] getVetorLista() {
        return vetorLista;
    }

}