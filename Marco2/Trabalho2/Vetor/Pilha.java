package Marco2.Trabalho2.Vetor;

public class Pilha implements IPilha {

    /**
     * @attribute vetor que representa a pilha
     */
    private Object[] pilha;
    /**
     * @attribute número de elementos da pilha
     */
    private int numElem;

    /**
     * @constructor cria uma pilha vazia
     * @param tamanhoVetor tamanho do vetor que representa a pilha
     */
    public Pilha(int tamanhoVetor) {
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    /**
     * @param info informação a ser inserida no topo da pilha
     */
    public boolean push(Object info) {
        if (this.numElem == pilha.length) {
            System.out.println("Pilha estourou!");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    /**
     * @return remove o topo da pilha e retorna a informação contida nele
     */
    public Object pop() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    /**
     * @return informação do topo da pilha
     */
    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.pilha[numElem - 1];
    }

    /**
     * @return true se a pilha está vazia e false caso contrário
     */
    public boolean isEmpty() {
        return this.numElem == 0;
    }

    /**
     * @return tamanho da pilha
     */
    public int size() {
        return this.numElem;
    }

    public String imprime() {
        String s = "";
        for (int i = 0; i < numElem; i++) {
            s += this.pilha[i] + " ";
        }
        return s;
    }

    /**
     * Método que verifica se uma pilha é palíndromo
     * @return true se a pilha é palíndromo e false caso contrário
     */
    public boolean palindromo(String palavra){
        for (int i = 0; i < palavra.length(); i++) {
            this.push(palavra.charAt(i));
        }

        for(int i = 0; i<palavra.length()/2; i++){
            if(this.pilha[i] != this.pilha[palavra.length()-1-i]){
                return false;
            }
        }
        return true;
    }

}
