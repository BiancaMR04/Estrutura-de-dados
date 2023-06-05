package Marco2.Trabalho2.LSE;

public class Pilha implements IPilha {

    /**
     * @attribute topo da pilha (referência para o nó do topo da pilha)
     */
    private Noh topo;

    /**
     * @constructor cria uma pilha vazia
     */
    public Pilha() {
        this.topo = null;
    }

    /**
     * @param info informação a ser inserida no topo da pilha
     * @return true se a inserção foi bem sucedida e false caso contrário
     */
    public void push(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
    }

    /**
     * @return remove o topo da pilha e retorna a informação contida nele
     */
    public Object pop() {
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProximo();
        }
        return info;
    }

    /**
     * @return informação do topo da pilha
     */
    public Object top() {
        Object info = null;
        if (!this.isEmpty())
            info = topo.getInfo();
        return info;
    }

    /**
     * @return true se a pilha está vazia e false caso contrário
     */
    public boolean isEmpty() {
        return topo == null;
    }

    /**
     * @return tamanho da pilha
     */
    public int size() {
        int tamanho = 0;
        for (Noh i = topo; i != null; i = i.getProximo()) {
            tamanho++;
        }
        return tamanho;
    }

    /**
     * @return string com os elementos da pilha
     */
    public String imprime(){
        String s = "";
        for (Noh i = topo; i != null; i = i.getProximo()) {
            s += i.getInfo() + " ";
        }
        return s;
    }

    /**
     * Método que inverte uma pilha
     * @return pilha invertida
     */
    public Pilha inverte(){
        Pilha aux = new Pilha();
        for (Noh i = topo; i != null; i = i.getProximo()) {
            aux.push(this.pop());
        }
        return aux;
    }
}