package Marco2.Trabalho2.LSE;

public class Noh {

    /**
     * @attribute info - Informação armazenada no nó.
     */
    private Object info;
    /**
     * @attribute proximo - Referência para o próximo nó.
     */
    private Noh proximo;

    /**
     * Construtor da classe Noh.
     * 
     * @param info - Informação a ser armazenada no nó.
     */
    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
    }

    /**
     * Retorna a informação armazenada no nó.
     * 
     * @return info - Informação armazenada no nó.
     */
    public Object getInfo() {
        return info;
    }

    /**
     * Altera a informação armazenada no nó.
     */
    public Noh getProximo() {
        return proximo;
    }

    /**
     * Altera a referência para o próximo nó.
     * 
     * @param n - Referência para o próximo nó.
     */
    public void setProximo(Noh n) {
        this.proximo = n;
    }

}
