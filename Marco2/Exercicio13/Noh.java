package Marco2.Exercicio13;

public class Noh {

    /**
     * @attribute info - Informação armazenada no Noh
     */
    private Aluno info;
    /**
     * @attribute proximo - Referência para o próximo Noh
     */
    private Noh proximo;

    /**
     * @constructor - Construtor da classe Noh
     */
    public Noh(Aluno info) {
        this.info = info;
        this.proximo = null;
    }

    /**
     * Método que retorna a informação armazenada no Noh
     * @return - Informação armazenada no Noh
     */
    public Aluno getInfo() {
        return info;
    }

    /**
     * Método que altera a informação armazenada no Noh
     * @param info - Nova informação a ser armazenada no Noh
     */
    public void setInfo(Aluno info) {
        this.info = info;
    }

    /**
     * Método que retorna a referência para o próximo Noh
     * @return - Referência para o próximo Noh
     */
    public Noh getProximo() {
        return proximo;
    }

    /**
     * Método que altera a referência para o próximo Noh
     * @param n - Nova referência para o próximo Noh
     */
    public void setProximo(Noh n) {
        this.proximo = n;
    }
    
}
