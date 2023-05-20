package Prova.Exercicio5;

public class Noh {
    
    private int info;
    private Noh proximo;
    private Noh anterior;

    public Noh (int info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public int getInfo() {
        return info;
     }
    public Noh getProximo() {
        return proximo;
     }

    public Noh getAnterior() {
        return anterior;
    }

    public void setProximo(Noh n) {
        this.proximo = n; 
    }

    public void setAnterior(Noh n){
        this.anterior = n;
    }
}
