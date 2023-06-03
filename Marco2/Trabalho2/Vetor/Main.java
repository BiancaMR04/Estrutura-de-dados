package Marco2.Trabalho2.Vetor;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o tamanho da palavra que deseja verificar se é palíndromo?");
        int tamanho = s.nextInt();
        Pilha p = new Pilha(tamanho);
        System.out.println("Digite uma palavra para verificar se é palíndromo: ");
        String palavra = s.next();

        if (p.palindromo(palavra)) {
            System.out.println("A palavra " + palavra + " é palíndromo!");
        } else {
            System.out.println("A palavra " + palavra + " não é palíndromo!");
        }

        System.out.println("Pilha:");
        System.out.println(p.imprime());
    }
}
