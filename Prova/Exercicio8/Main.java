package Prova.Exercicio8;

public class Main {

    public static void main(String[] args){

        LDE lista = new LDE();
        LDE lista2 = new LDE();

        lista.insereFim(1);
        lista.insereFim(2);
        lista2.insereFim(9);
        lista2.insereFim(8);
        lista2.insereFim(7);

        lista.concat(lista2);

        System.out.println(lista.imprimeListaInicio());
    }
    
}
