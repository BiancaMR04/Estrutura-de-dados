package Exercicio3;

public class VetorAluno implements IVetorAluno{

    private int totalAlunos = 0;
    private Aluno[] alunos = new Aluno[4];

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;

    }

    public int tamanho(){
        return totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i=0; i<this.totalAlunos; i++){
            if(aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if (totalAlunos == this.alunos.length){
        return true;
        }
        return false;
        }


    private void garanteEspaco(){
        if (this.cheio()){
        Aluno[] novosAlunos = new Aluno[this.alunos.length * 2];
        for (int i=0; i < this.alunos.length; i++)
        novosAlunos[i] = this.alunos[i];
        this.alunos = novosAlunos;
        }

    }

    public boolean remove(Aluno aluno){
        int indice = -1;
        for(int i=0; i < totalAlunos; i++) //faz a busca
        if (aluno == this.alunos[i])
        {indice = i; break; }
        if (indice != -1){ //achou o elemento
        /*for(int i=indice; i<(numElementos-1); i++)
        vetorInt[i] = vetorInt[i+1];*/
        totalAlunos--;
        return true;
        }
        return false;
        }
        
	
}
