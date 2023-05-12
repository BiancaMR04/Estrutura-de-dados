package Exercicio6;

public class Main {
    
    public static void main(String[] args) {

        ILDE vetAlunos = new LDE();

        Aluno aluninho1 = new Aluno("leo", 17, 8);
        Aluno aluninho2 = new Aluno("joao", 16, 5);
        Aluno aluninho3 = new Aluno("luisa", 18, 6);
    
        System.out.println(vetAlunos.tamanho());
    
        System.out.println(vetAlunos.estahVazia());
    
        vetAlunos.remove(aluninho1);
    
        System.out.println(vetAlunos.tamanho());
    
        System.out.println(vetAlunos.imprimeListaInicio());
        System.out.println(vetAlunos.imprimeListaFim());
    
    }
}
