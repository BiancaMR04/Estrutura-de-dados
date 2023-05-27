package Exercicio10;

public class FilaVet implements IFila {

    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila) { // construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info) { 
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() {
        if (this.isEmpty()) { 
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean isEmpty() {
        return (this.nElemFila == 0);
    }

    public int size(){
        return nElemFila;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("Fila está vazia");
            return;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        for (int i = this.inicio; i != fim; i = (i + 1) % this.vetFila.length) {
            System.out.println(this.vetFila[i]);
        }
    }

    public int printe() {
        if (this.isEmpty()) {
            System.out.println("Fila estah vazia");
            return 0;
        }
        int indice = this.inicio;
        for (int i = 0; i < this.nElemFila; i++) {
            System.out.println(this.vetFila[indice]);
            indice = (indice + 1) % this.vetFila.length;
        }
        return 1;
    }

}
