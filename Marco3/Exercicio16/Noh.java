package Marco3.Exercicio16;

public class Noh {
    private int info;
    private Noh esquerda;
    private Noh direita;
    private Noh pai;
    private int fatorBalanceamento;

    public Noh(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

    public Noh getDireita() {
        return direita;
    }

    public void setDireita(Noh direita) {
        this.direita = direita;
    }

    public Noh getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Noh esquerda) {
        this.esquerda = esquerda;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }
}
