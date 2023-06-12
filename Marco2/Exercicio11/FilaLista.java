package Marco2.Exercicio11;

public class FilaLista implements IFila {

    private Noh inicio;
    private Noh fim;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Object info) { // insere
        Noh novo = new Noh(info);
        if (this.isEmpty())
            inicio = novo;
        else
            fim.setProximo(novo);
        fim = novo;
        return true;
    }

    public boolean remove() { // remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProximo();
            return true;
        }
        return false;
    }

    public boolean isEmpty() { // vazia
        return (inicio == null);
    }

    public int size() { // tamanho
        int cont = 0;
        Noh aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }
        return cont;
    }

    public void print() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

}
