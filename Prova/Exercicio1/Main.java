package Prova.Exercicio1;

/*
 * Questão 1) Escreva um programa iterativo (Java) que recebe como entrada dois arranjos (dois vetores de inteiros),
 *  cada um com n elementos, e devolve como saída a interseção entre os dois.
 *  O retorno é outro vetor contendo os elementos comuns a ambos os vetores.
 *  Faça a análise de complexidade de seu algoritmo no pior caso e relate no seu PIÁ.
 */
public class Main {

    public static void main(String[] args) {
    Vetor vetor1 = new Vetor(10);
    Vetor vetor2 = new Vetor(10);
    vetor1.popularAleatorio();
    vetor2.popularAleatorio();
    vetor1.imprime();
    System.out.println("------------------");
    vetor2.imprime();

    System.out.println(vetor1.getIntersecao(vetor2));
    }

    
}
