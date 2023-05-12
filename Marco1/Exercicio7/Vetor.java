package Exercicio7;
import java.util.Random;

public class Vetor{

    Random rand = new Random();
    private int total = 0;
    private int[] numeros;

    public Vetor(int tamanho){
        numeros = new int[tamanho];
    }

    public Vetor(){
        numeros  = new int[8];
    }

    public void adiciona(int numero){
        this.numeros[this.total] = numero;
        this.total++;
    }

    public int total(){
        return this.total;
    }

    public boolean contem(int numero){
        for(int i=0; i<this.total; i++){
            if(numero == this.numeros[i]){
                return true;
            }
        }
        return false;
    }

    public int rand() {
        return (new Random()).nextInt();
    }

    public void popularAleatorio(){
        for (int i = 0; i < numeros.length; i++) {
            adiciona(rand());
         }

    }

    public int maiorNrec(Vetor vetor, int inicio, int fim){
        int meio=0, max1 = 0, max2 = 0;
        if(inicio == fim){
            return numeros[inicio];
        }else{
            meio = (inicio+fim)/2;
            max1 = maiorNrec(vetor, inicio, meio);
            max2 = maiorNrec(vetor, meio+1, fim);
            if (max1 > max2){
            return max1;
            }else{
                return max2;
            }
        }
    }

    public int maiorIterativo(){
        int max = numeros[0];

        for(int i = 0; i<numeros.length; i++){
            if(numeros[i]>max){
                max = numeros[i];
            }
        }
        return max;

    }
}
