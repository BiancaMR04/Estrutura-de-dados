public class Vetor{

    private int totalAlunos = 0;
    private Aluno[] alunos;

    public Vetor(){
        alunos  = new Aluno[8];
    }

    public void adiciona(Aluno aluno){
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }

    public int total(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i=0; i<this.totalAlunos; i++){
            if(aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }
}
