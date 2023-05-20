package Prova.Exercicio3;
import java.util.Scanner;

/**
 * Implemente, em Linguagem Java, um método que calcula o enésimo termo da série de Fibonacci.
 */
public class Main {
    
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição na série Fibonacci que deseja saber: ");
        n = scanner.nextInt();

        System.out.println("O " + n + "º termo da série Fibonacci é: " + fibonacci.fibonacci(n));

    }
}
