package Prova.Exercicio6;

public class LDE {
    
    private Noh inicio;
    private Noh fim;

    public LDE(){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);

            if (inicio == null){
                inicio = novo;
                fim = novo;
            }else {
                novo.setProximo(inicio);
                inicio.setAnterior(novo);
                inicio = novo;
            }

    }

    public void insereFim(int info) {
        Noh novo = new Noh(info);

            if (fim == null){
                inicio = novo;
                fim = novo;
            }else {
                novo.setAnterior(fim);
                fim.setProximo(novo);
                fim = novo;
                    
            }
    }

    public boolean remove(int info) {
        Noh p = inicio;
            while (p!=null && p.getInfo() != info)
            p = p.getProximo();
                if (p==null)
                return false;

                if (p == inicio){
                inicio = p.getProximo();

                    if (inicio != null) inicio.setAnterior(null);
                    else fim = null;
                } else if(p.getProximo() == null){
                    p.getAnterior().setProximo(null);
                    fim = p.getAnterior();
                    } else {
                        p.getAnterior().setProximo(p.getProximo());
                        p.getProximo().setAnterior(p.getAnterior());
                    }
            return true;
        }


    public boolean removeContrario(int info) {
        Noh p = fim;
            while (p!=null && p.getInfo() != info)
            p = p.getAnterior();
                if (p==null)
                return false;

                if (p == fim){
                fim = p.getAnterior();

                    if (fim != null) fim.setProximo(null);
                    else fim = null;
                } else if(p.getAnterior() == null){
                    p.getProximo().setAnterior(null);
                    fim = p.getProximo();
                    } else {
                        p.getProximo().setAnterior(p.getAnterior());
                        p.getAnterior().setProximo(p.getProximo());
                    }
            return true;
    }

    public boolean estahVazia() { 
        return inicio == null;
    }

    public int tamanho() {
        int tamanho = 0;
    
        for(Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }
    
        return tamanho;
    }

    public String imprimeListaInicio() {

        String lista = "";
    
        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }
    
        return lista;
    }

    public String imprimeListaFim() {

        String lista = "";
    
        for(Noh i = fim; i != null; i = i.getAnterior()) {
            lista += i.getInfo() + " ";
        }
    
        return lista;
    }

    public void insereEmOrdem(int numero){

        Noh novo = new Noh(numero);

        if (inicio == null){
            inicio = novo;
            fim = novo;
        }else if(numero < inicio.getInfo()){
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }else if(numero > fim.getInfo()){
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }else{
            Noh noh = inicio;

            for(Noh i=inicio; i != null; i.getProximo()){
                if (numero > i.getInfo()){
                    noh = i; 
                    break; 
                }
            }

            if (noh != inicio){ 
                novo.setAnterior(noh.getAnterior());
                noh.getAnterior().setProximo(novo);
                novo.setProximo(noh);
                noh.setAnterior(novo);
            }
        }
    }
}
