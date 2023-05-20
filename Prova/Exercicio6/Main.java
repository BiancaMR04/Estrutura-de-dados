package Prova.Exercicio6;

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
