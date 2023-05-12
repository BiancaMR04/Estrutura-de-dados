package Exercicio4;

public class Main{
    public static void main(String[] args) {

    ILSE vetAlunos = new LSE();
    Aluno aluninho1 = new Aluno("leo", 17, 8);
    Aluno aluninho2 = new Aluno("joao", 16, 5);
    Aluno aluninho3 = new Aluno("luisa", 18, 6);

    vetAlunos.insereFim(aluninho1);
    vetAlunos.insereInicio(aluninho2);
    vetAlunos.insereInicio(aluninho3);

    System.out.println(vetAlunos.tamanho());

    System.out.println(vetAlunos.estahVazia());

    vetAlunos.remove(aluninho1);

    System.out.println(vetAlunos.tamanho());

    System.out.println(vetAlunos.imprimeLista());



    }
}