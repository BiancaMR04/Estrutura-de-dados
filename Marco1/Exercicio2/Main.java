public class Main{

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor();
        Aluno aluno1 = new Aluno("querida", 12, 8);

        vetor.adiciona(aluno1);
        System.out.println(vetor.total());
        System.out.println(vetor.contem(aluno1));
    }
}
