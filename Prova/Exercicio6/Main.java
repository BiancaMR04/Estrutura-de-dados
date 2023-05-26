package Prova.Exercicio6;

/*
 * Implemente um método que insere números inteiros em uma lista duplamente encadeada de forma ordenada.
 */
public class Main {
    
    public static void main(String[] args){

        LDE lde = new LDE();
        lde.insereEmOrdem(4);
        lde.insereEmOrdem(2);
        lde.insereEmOrdem(9);
        lde.insereEmOrdem(1);

        System.out.println(lde.imprimeListaInicio());

    }
}
