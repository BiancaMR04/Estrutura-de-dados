package Prova.Exercicio3;
import java.util.Scanner;

/**
 * Implemente, em Linguagem Java, um método que calcula o enésimo termo da série de Fibonacci.
 */
public class Main {
    
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do termo desejado: ");
        int n = scanner.nextInt();

        //int n = 10; // Número do termo desejado
        int resultado = fibonacci.calcularFibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + resultado);

        scanner.close();
    }

}
