package Prova.Exercicio1;

import java.util.Random;

public class Vetor {

    Random rand = new Random();
    private int[] vetor;
    private int total;

    /**
     * Construtor da classe Vetor
     * @param tamanho do vetor
     */
    public Vetor(int tamanho){
        this.vetor = new int[tamanho];
    }

    /**
     * Construtor da classe Vetor default
     */
    public Vetor(){
        vetor = new int[10];
    }

    /**
     * Método para adicionar um elemento int no vetor
     * @param numero a ser adicionado int
     */
    public void adiciona(int numero){
        this.garanteEspaco();
        this.vetor[total] = numero;
        total++;
    }

    /**
     * Retorna o tamanho do vetor
     * @return total de elementos no vetor
     */
    public int tamanho(){
        return total;
    }

    /**
     * Método para verificar se o vetor contém um elemento 
     * @param vetor numero há ser verificado
     * @return true se encontrado ou false senão
     */
    public boolean contem(int vetor){
        for(int i=0; i<this.total; i++){
            if(vetor == this.vetor[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * Método para verificar se o vetor está cheio
     * @return true se cheio ou false senão
     */
    public boolean cheio(){
        if (total == this.vetor.length)
        return true;
        return false;
    }

    /**
     * Método para garantir espaço no vetor
     */
    private void garanteEspaco(){
        if (this.cheio()){
        int[] novos = new int[this.vetor.length * 2];
        for (int i=0; i < this.vetor.length; i++)
        novos[i] = this.vetor[i];
        this.vetor = novos;
        }

    }

    /**
     * Método para popular o vetor com números aleatórios
     */
    public void popularAleatorio(){
        for (int i = 0; i < vetor.length; i++) {
            adiciona(rand.nextInt(100));
        }
    }

    /**
     * Método para imprimir o vetor
     */
    public void imprime(){
        for(int i=0; i < total; i++){
            System.out.println(vetor[i]);
        }
    }

    /**
     * Método para retornar a interseção entre dois vetores
     * @param vetor2 vetor a ser comparado
     * @return String com os números em comum, concatenados
     */
    public String getIntersecao(Vetor vetor2){
        String intersecao = "";
        for(int i=0; i < total; i++){
            for(int j=0; j < vetor2.tamanho(); j++){
                if(vetor[i] == vetor2.vetor[j]){
                    intersecao += vetor[i] + " ";
                }
            }
        }
        return "Números em comum: " + intersecao + "\n";
    }

    
}
