package Exercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vetor vetor = new Vetor(10);
        vetor.popularAleatorio();

        long start = System.nanoTime();
        vetor.bubble_sort();
        long elapsedTime = System.nanoTime() - start;

        System.out.println("Tempo de execução: " + elapsedTime + " nanosegundos no Bubble Sort");

        long start2 = System.nanoTime();
        vetor.selection_sort();
        long elapsedTime2 = System.nanoTime() - start2;

        System.out.println("Tempo de execução: " + elapsedTime2 + " nanosegundos no Selection Sort");

        long start3 = System.nanoTime();
        vetor.insertion_sort();
        long elapsedTime3 = System.nanoTime() - start3;

        System.out.println("Tempo de execução: " + elapsedTime3 + " nanosegundos no Insertion Sort");


 
        
    }
    
}
