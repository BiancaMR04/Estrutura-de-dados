package Marco3.Exercicio15;

public class Main {

    public static void main(String[] args) {

        ABB arvore = new ABB();

        arvore.add(10);
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
        arvore.add(10);
        arvore.add(5);

        System.out.println("Árvore: ");
        arvore.imprimePreOrdem();

        arvore.add(2);
        arvore.add(0);
        arvore.add(9);
        arvore.add(1);

        System.out.println("Árvore: ");
        arvore.emOrdem();

        System.out.println("Deletando 5");
        arvore.remove(5);

        System.out.println("Árvore: ");
        arvore.posOrdem();

    }
}
