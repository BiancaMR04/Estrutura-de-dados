package Marco3.Exercicio16;

public class Main {
    public static void main(String[] args) {
        AVL arvore = new AVL();

        // Adiciona os números à árvore
        arvore.adicionar(51, arvore.getRaiz());
        arvore.adicionar(57, arvore.getRaiz());
        arvore.adicionar(98, arvore.getRaiz());
        arvore.adicionar(19, arvore.getRaiz());
        arvore.adicionar(11, arvore.getRaiz());
        arvore.adicionar(45, arvore.getRaiz());
        arvore.adicionar(79, arvore.getRaiz());

        // Verifica se a árvore está balanceada
        boolean estaBalanceada = arvore.arvoreBalanceada(arvore.getRaiz());
        System.out.println("A árvore está balanceada? " + estaBalanceada);

        // Imprime a árvore
        arvore.imprimirArvore(arvore.getRaiz(), "");
    }

}