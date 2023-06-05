package Marco2.Trabalho2.LSE;

public class Main {
    
    public static void main(String[] args) {
        IPilha p = new Pilha();
        Aluno aluno1 = new Aluno("João", 20, 8.5);
        Aluno aluno2 = new Aluno("Maria", 19, 9.0);
        Aluno aluno3 = new Aluno("José", 21, 7.5);
        Aluno aluno4 = new Aluno("Ana", 18, 9.5);
        Aluno aluno5 = new Aluno("Pedro", 22, 6.5);
        p.push(aluno1);
        p.push(aluno2);
        p.push(aluno3);
        p.push(aluno4);
        p.push(aluno5);
        System.out.println(p.imprime());
        System.out.println("-------------");
        Pilha p2 = p.inverte();
        System.out.println(p2.imprime());
    }
}
