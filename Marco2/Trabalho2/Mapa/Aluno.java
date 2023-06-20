package Marco2.Trabalho2.Mapa;

public class Aluno {

    /**
     * @attribute matricula - matricula do aluno
     */
    private int matricula;
    /**
     * @attribute nome - nome do aluno
     */
    private String nome;

    /**
     * Construtor da classe Aluno
     * @param nome - nome do aluno
     * @param matricula - matricula do aluno
     */
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    /**
     * Retorna a matricula do aluno
     * @return matricula do aluno
     */
    public int getMatricula(){
        return matricula;
    }

    /**
     * Retorna o nome do aluno
     * @return nome do aluno
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera a matricula do aluno
     * @param matricula - nova matricula do aluno
     */
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    /**
     * Altera o nome do aluno
     * @param nome - novo nome do aluno
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna uma string com os dados do aluno
     * @return string com os dados do aluno
     */
    public String toString(){
        return "Nome: " + nome + " matricula: " + matricula +  "\n";
    }
}
