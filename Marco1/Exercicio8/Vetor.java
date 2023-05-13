package Exercicio8;

import java.util.Random;

public class Vetor{

    Random rand = new Random();
    private int total = 0;
    private int[] numeros;

    public Vetor(int tamanho){
        this.numeros = new int[tamanho];
    }

    public void adiciona(int numeros){
        this.garanteEspaco();
        this.numeros[total] = numeros;
        total++;
    }

    public int tamanho(){
        return total;
    }

    public boolean contem(int numeros){
        for(int i=0; i<this.total; i++){
            if(numeros == this.numeros[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if (total == this.numeros.length)
        return true;
        return false;
    }


    private void garanteEspaco(){
        if (this.cheio()){
        int[] novos = new int[this.numeros.length * 2];
        for (int i=0; i < this.numeros.length; i++)
        novos[i] = this.numeros[i];
        this.numeros = novos;
        }

    }

    public void popularAleatorio(){
        for (int i = 0; i < numeros.length; i++) {
            adicionas(rand.nextInt(100));
        }
    }

    public int buscaRec(Vetor vetor, int inicio, int fim, int numero){
        int meio=0, n1 = 0, n2 = 0;
        if(inicio == fim && numeros[inicio] == numero){
            return numeros[inicio];
        }else{
            meio = (inicio+fim)/2;
            n1 = buscaRec(vetor, inicio, meio, numero);
            n2 = buscaRec(vetor, meio+1, fim, numero);
            if (n1 == numero){
            return n1;
            }else{
                return n2;
            }
        }
    }

    public int busca_binaria(int valor){
        int inicio = 0;
        int fim = this.total - 1;
        int meio = 0; 
        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            if (this.numeros[meio] == valor){
                return meio;
            }else if (this.numeros[meio] > valor){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }
        return -1;  
    }

    public void adicionas(int numero){
        int indice = -1;

        for(int i=0; i < total; i++){ //faz a busca
            if (numero> this.numeros[i]){
                indice = i; 
                break; 
            }
        }

        if (indice != -1){ //achou o elemento
            for(int i=(total+1); i>indice; i--){
                numeros[i] = numeros[i-1];
            }

        numeros[indice] = numero;
        }
    }
        

	
}
