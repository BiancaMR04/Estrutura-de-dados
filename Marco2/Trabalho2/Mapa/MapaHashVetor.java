package Marco2.Trabalho2.Mapa;

public class MapaHashVetor {

    /**
     * @attribute vetor - vetor de alunos
     */
    private Aluno[] vetor;
    /**
     * @attribute sondagem - número de sondagens
     */
    int sondagem = 0;
    /**
     * @attribute elem - número de elementos
     */
     int elem = 0;

    /**
     * Construtor da classe MapaHashVetor
     */
    public MapaHashVetor() {
        this.vetor = new Aluno[5];
    }

    /**
     * Retorna o hash da chave
     * 
     * @param chave - chave do aluno
     * @return hash da chave
     */
    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    /**
     * Retorna o aluno com a chave passada
     * 
     * @param chave - chave do aluno
     * @return aluno com a chave passada
     */
    public Aluno get(int chave) {
        int hash = (hash(chave) + sondagem) % vetor.length;
        return this.vetor[hash];
    }

    /**
     * Insere um aluno no vetor
     * 
     * @param chave - chave do aluno
     * @param valor - aluno a ser inserido
     */
    public void put(int chave, Aluno valor) {
        this.verificaTamanho(chave);
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
        }
        elem = chave;
    }

    /**
     * Remove um aluno do vetor
     * 
     * @param chave - chave do aluno
     */
    public Aluno remove() {
        int hash = (hash(elem) + sondagem) % vetor.length;
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        elem = hash-1;
        return aluno;
    }


    /**
     * Verifica se o vetor está sendo preenchido no último elemento
     * @param chave - chave do aluno
     */
    public void verificaTamanho(int chave){
        int hash = (hash(chave) + sondagem) % vetor.length;
        
        if(hash == vetor.length - 1){
            reSize();
        }
        
    }

    /**
     * Redimensiona o vetor
     */
    public void reSize(){
        Aluno[] novoVetor = new Aluno[this.vetor.length * 2];

        for (int i = 0; i < this.vetor.length; i++) {
            novoVetor[i] = this.vetor[i];
        }

        this.vetor = novoVetor;
        reHash();

    }

    /**
     * Reorganiza o vetor
     */
    public void reHash(){
        for(int i = 0; i < this.vetor.length; i++){
            if(this.vetor[i] != null){
                int chave = this.vetor[i].getMatricula();
                Aluno aluno = this.vetor[i];
                this.remove();
                this.put(chave, aluno);
            }
        }
    }

}