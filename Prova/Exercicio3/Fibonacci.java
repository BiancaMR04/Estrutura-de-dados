package Prova.Exercicio3;

public class Fibonacci {

    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
