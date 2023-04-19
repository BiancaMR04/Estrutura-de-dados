package Exercicio5;

public class Main {
    
    public static void main(String[] args) {

        ILDE listaN = new LDE();
    
        listaN.insereFim(1);
        listaN.insereInicio(2);
        listaN.insereInicio(3);
    
        System.out.println(listaN.tamanho());
    
        System.out.println(listaN.estahVazia());
    
        listaN.remove(1);
    
        System.out.println(listaN.tamanho());
    
        System.out.println(listaN.imprimeListaInicio());
        System.out.println(listaN.imprimeListaFim());
    
    }
    
}
