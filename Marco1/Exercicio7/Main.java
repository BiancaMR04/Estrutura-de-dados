package Exercicio7;
import Exercicio7.Vetor;

public class Main {

    Vetor vetor = new Vetor(1000);
    
    vetor.popularAleatorio();

    System.out.println(vetor.maiorNrec(vetor, 0, vetor.total()-1));
    System.out.println(System.nanoTime());

    System.out.println(vetor.maiorIterativo());
    System.out.println(System.nanoTime());

    
}
