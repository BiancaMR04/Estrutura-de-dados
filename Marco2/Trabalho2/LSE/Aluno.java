package Marco2.Trabalho2.LSE;

public class Aluno {

    /**
     * @attribute idade - idade do aluno
     */
    private int idade;
    /**
     * @attribute nome - nome do aluno
     */
    private String nome;
    /**
     * @attribute nota - nota do aluno
     */
    private double nota;

    /**
     * Construtor da classe Aluno
     * @param nome - nome do aluno
     * @param idade - idade do aluno
     * @param nota - nota do aluno
     */
    public Aluno(String nome, int idade, double nota){
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
    }

    /**
     * Retorna a idade do aluno
     * @return idade do aluno
     */
    public int getIdade(){
        return idade;
    }

    /**
     * Retorna o nome do aluno
     * @return nome do aluno
     */
    public String getNome(){
        return nome;
    }

    /**
     * Retorna a nota do aluno
     * @return nota do aluno
     */
    public double getNota(){
        return nota;
    }

    /**
     * Altera a idade do aluno
     * @param idade - nova idade do aluno
     */
    public void setidade(int idade){
        this.idade = idade;
    }

    /**
     * Altera o nome do aluno
     * @param nome - novo nome do aluno
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Altera a nota do aluno
     * @param nota - nova nota do aluno
     */
    public void setCurso(double nota){
        this.nota = nota;
    }

    /**
     * Retorna uma string com os dados do aluno
     * @return string com os dados do aluno
     */
    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Nota: " + nota + "\n";
    }
}
