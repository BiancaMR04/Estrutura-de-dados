package Marco3.Exercicio14;

public class Main {
    
    public static void main(String[] args) {
        ABB arvore = new ABB();
        arvore.add(10);
        arvore.add(5);
        arvore.add(15);
        arvore.add(3);
        arvore.add(7);
        arvore.add(12);
        arvore.add(17);
        arvore.add(1);
        arvore.add(4);
        arvore.add(6);
        arvore.add(8);
        arvore.add(11);
        arvore.add(13);
        arvore.add(16);

        long start = System.nanoTime();
        arvore.add(18);
        long end = System.nanoTime() - start;
        System.out.println("Tempo de execução do método add iterativo: " + end + " nanosegundos");

        start = System.nanoTime();
        arvore.recursiveAdd(19);
        end = System.nanoTime() - start;
        System.out.println("Tempo de execução do método add recursivo: " + end + " nanosegundos");


        System.out.println("Árvore binária de busca:");
        arvore.imprimePreOrdem();

        System.out.println("Buscando o elemento 10:");
        System.out.println(arvore.search(10));

    }
}
