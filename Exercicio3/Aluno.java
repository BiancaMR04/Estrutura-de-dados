package Exercicio3;

public class Aluno{

    private int idade;
    private String nome;
    private double nota;

    public Aluno(String nome, int idade, double nota){
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public double getNota(){
        return nota;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCurso(double nota){
        this.nota = nota;
    }
}
