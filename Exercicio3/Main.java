package Exercicio3;

public class Main{
    public static void main(String[] args) {

    IVetorAluno vetAlunos = new VetorAluno();
    Aluno aluninho1 = new Aluno("leo", 17, 8);
    Aluno aluninho2 = new Aluno("joao", 16, 5);
    Aluno aluninho3 = new Aluno("luisa", 18, 6);

    vetAlunos.adiciona(aluninho1);
    vetAlunos.adiciona(aluninho2);
    vetAlunos.adiciona(aluninho3);

    System.out.println(vetAlunos.tamanho());

    System.out.println(vetAlunos.contem(aluninho2));

    vetAlunos.cheio();


    }
}