package Exercicio6;

public class Noh {
    
    private Object info;
    private Noh proximo;
    private Noh anterior;

    public Noh (Object info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() {
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
