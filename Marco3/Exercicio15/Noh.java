package Marco3.Exercicio15;

public class Noh {

    /**
     * @attribute valor - Valor do nó
     */
    int valor;
    /**
     * @attribute esq - Nó da esquerda
     */
    Noh esq;
    /**
     * @attribute dir - Nó da direita
     */
    Noh dir;
    /**
     * @attribute pai - Nó pai
     */
    Noh pai;

    Noh(int valor) {
        this.valor = valor;
    }

    /**
     * @method getValor - Retorna o valor do nó
     * @return valor - Valor do nó
     */
    public int getValor() {
        return valor;
    }

    /**
     * @method setValor - Altera o valor do nó
     * @param valor - Valor novo do nó
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @method getEsq - Retorna o nó da esquerda
     * @return esq - Nó da esquerda
     */
    public Noh getEsq() {
        return esq;
    }

    /**
     * @method setEsq - Altera o nó da esquerda
     * @param esq - Nó novo da esquerda
     */
    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    /**
     * @method getDir - Retorna o nó da direita
     * @return dir - Nó da direita
     */
    public Noh getDir() {
        return dir;
    }

    /**
     * @method setDir - Altera o nó da direita
     * @param dir - Nó novo da direita
     */
    public void setDir(Noh dir) {
        this.dir = dir;
    }

    /**
     * @method getPai - Retorna o nó pai
     * @return pai - Nó pai
     */
    public Noh getPai() {
        return pai;
    }

    /**
     * @method setPai - Altera o nó pai
     * @param pai - Nó novo pai
     */
    public void setPai(Noh pai) {
        this.pai = pai;
    }

    /**
     * @method toString - Retorna o valor do nó
     * @return valor - Valor do nó
     */
    public String toString() {
        return String.valueOf(valor);
    }
}
