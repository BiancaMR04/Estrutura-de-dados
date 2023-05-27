package Prova.Exercicio9;

/**
 * Implemente um método para imprimir números inteiros de forma recursiva de uma lista simplesmente encadeada.
 */

public class Main {
    
    public static void main(String[] args){
        LSE list = new LSE();
        list.insereFim(90);
        list.insereFim(20);
        list.insereFim(30);
        list.insereFim(80);
        list.insereFim(50);
        list.insereFim(50);
        list.insereFim(60);
        list.bubbleSort();
        System.out.println(list.imprimeLista());

    }
}
