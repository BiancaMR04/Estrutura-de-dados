package Prova.Exercicio3;

public class Fibonacci {

    public Fibonacci() {
    }

    public int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
    
}
