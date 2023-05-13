package Exercicio7;
import Exercicio7.Vetor;

public class Main {

    public static void main(String[] args) {

    Vetor vetor = new Vetor(1000);
    
    vetor.popularAleatorio();
    long elapsed = 0;

    long start = System.nanoTime();
    System.out.println(vetor.maiorNrec(vetor, 0, 999));
    System.out.println(elapsed = System.nanoTime() - start);

    long elapsed2 = 0;

    long start2 = System.nanoTime();
    System.out.println(vetor.maiorIterativo());
    System.out.println(elapsed2 = System.nanoTime() - start2);
    }

    
}
