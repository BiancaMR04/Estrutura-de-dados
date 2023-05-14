package Exercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vetor vetor = new Vetor(10);
        vetor.popularAleatorioEmOrdem();
        vetor.imprime();
        System.out.println("Máximo: " + vetor.maximoRec(vetor, 0, vetor.tamanho() - 1));

        System.out.println("Digite um número para buscar: ");
        int numero = input.nextInt();


        long start = System.nanoTime();
        if(vetor.busca_binaria(numero) == numero){
            System.out.println("Número encontrado!"+ vetor.busca_binaria(numero));
        }else{
            System.out.println("Número não encontrado!");
        }
        long end = System.nanoTime();
        System.out.println("Tempo de execução: " + (end - start) + "ns");

        long start2 = System.nanoTime();
        if (vetor.buscaRec(vetor, 0, vetor.tamanho() - 1, numero) == numero) {
            System.out.println("Número encontrado!"+ vetor.buscaRec(vetor, 0, vetor.tamanho() - 1, numero));
        } else {
            System.out.println("Número não encontrado!");
        }
        long end2 = System.nanoTime();
        System.out.println("Tempo de execução: " + (end2 - start2) + "ns");
        
    }
    
}
