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

    public void adicionaEmOrdem(int numero){
        this.garanteEspaco();

        if(total == 0){
            numeros[0] = numero;
            total++;

        }else if(numero > numeros[total-1]){
            numeros[total] = numero;
            total++;

        }else{

        int indice = -1;

        for(int i=0; i < total; i++){
            if (numero < this.numeros[i]){
                indice = i; 
                break; 
            }
        }

        if (indice != -1){ 
            for(int i=(total); i>indice; i--){
                numeros[i] = numeros[i-1];
            }

        numeros[indice] = numero;
        total++;
        }
    }
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

    public void popularAleatorioEmOrdem(){
        for (int i = 0; i < numeros.length; i++) {
            adicionaEmOrdem(rand.nextInt(100));
        }
    }


    public int maximoRec(Vetor vetor, int inicio, int fim){
        int meio=0, max1 = 0, max2 = 0;
        if(inicio == fim){
            return numeros[inicio];
        }else{
            meio = (inicio+fim)/2;
            max1 = maximoRec(vetor, inicio, meio);
            max2 = maximoRec(vetor, meio+1, fim);
            if (max1 > max2){
            return max1;
            }else{
                return max2;
            }
        }

    }

    public int buscaRec(Vetor vetor, int inicio, int fim, int numero){
        int meio=0;

        if (inicio > fim) {
            return -1;
        }
        meio= (inicio + fim) / 2;
        if (numeros[meio] == numero) {
            return numeros[meio];
        } else if (numeros[meio] > numero) {
            return buscaRec(vetor, inicio, meio-1, numero); 
        } else {
            return buscaRec(vetor, meio+1, fim, numero);
        }
    }

    public int busca_binaria(int valor){
        int inicio = 0;
        int fim = this.total - 1;
        int meio = 0; 
        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            if (this.numeros[meio] == valor){
                return numeros[meio];
            }else if (this.numeros[meio] > valor){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }
        return -1;  
    }

    public void imprime(){
        for(int i=0; i < total; i++){
            System.out.println(numeros[i]);
        }
    }
        

	
}
