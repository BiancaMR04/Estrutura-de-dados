package Exercicio4;

public class LSE implements ILSE {

    private Noh inicio;
    
    public LSE(){
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }

    }

   public void insereFim(Object info) {
    Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
                for(Noh i=inicio; i != null; i=i.getProximo())
                ultimo = i;
                ultimo.setProximo(novo);
        }
    }

   public boolean estahVazia() { 
        return inicio == null;
   }


   public boolean remove(Object info) {
    Noh ant=null, p;
    p = inicio;
        while (p!=null && p.getInfo() != info){ //busca
            ant = p;
            p = p.getProximo();
        }

    if (p==null) // não achou, então não faz nada e retorna false
    return false;

    if (ant==null) //retira info do início
    inicio = p.getProximo();

    else
    ant.setProximo(p.getProximo());
    return true;

    }



   public int tamanho() {
    int tamanho = 0;

    for(Noh i = inicio; i != null; i = i.getProximo()) {
        tamanho++;
    }

    return tamanho;
    }

    public String imprimirLista() {

        String lista = "";

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
   
}
