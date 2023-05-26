package Prova.Exercicio7;

/**
 * Implemente um método para imprimir números inteiros de forma recursiva de uma lista simplesmente encadeada.
 */

public class Main {
    
    public static void main(String[] args){
        LSE list = new LSE();
        list.insereFim(10);
        list.insereFim(20);
        list.insereFim(30);
        list.insereFim(40);
        list.imprime_rec();

    }
}
