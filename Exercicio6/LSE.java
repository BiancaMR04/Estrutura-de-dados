package Exercicio6;

import Exercicio6.ILSE;

public class LSE implements ILSE{
    
    private Noh inicio;
    private Noh fim;

    public LSE(){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object info) {
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

    public void insereFim(Object info) {
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

    public boolean remove(Object info) {
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
        

    


}
