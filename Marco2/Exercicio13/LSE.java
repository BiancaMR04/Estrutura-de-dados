package Marco2.Exercicio13;

public class LSE {

    /**
     * @attribute inicio - Noh que representa o início da lista
     */
    private Noh inicio;

    /**
     * @constructor - Construtor da classe LSE
     */
    public LSE() {
        this.inicio = null;
    }

    /**
     * Método que retorna o início da lista
     * @return - Início da lista
     */
    public Noh getInicio() {
        return inicio;
    }

    /**
     * Método que insere um novo Noh no início da lista
     * @param info - Informação a ser inserida no Noh
     */
    public void insereInicio(Aluno info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }

    }

    /**
     * Método que insere um novo Noh no fim da lista
     * @param info - Informação a ser inserida no Noh
     */
    public void insereFim(Aluno info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo())
                ultimo = i;
            ultimo.setProximo(novo);
        }
    }

    /**
     * Método que insere um novo Noh na lista de forma ordenada
     * @return - Informação a ser inserida no Noh
     */
    public boolean estahVazia() {
        return inicio == null;
    }

    /**
     * Método que remove um Noh da lista
     * @param info - Informação a ser removida do Noh
     * @return - true se a informação foi removida, false caso contrário
     */
    public boolean remove(Aluno info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info) { // busca
            ant = p;
            p = p.getProximo();
        }

        if (p == null) 
            return false;

        if (ant == null) 
            inicio = p.getProximo();

        else
            ant.setProximo(p.getProximo());
        return true;

    }

    /**
     * Método que retorna o tamanho da lista
     * @return - Tamanho da lista
     */
    public int tamanho() {
        int tamanho = 0;

        for (Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    /**
     * Método que imprime a lista
     * @return Strin da lista 
     */
    public String imprimeLista() {

        String lista = "";

        for (Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
}
