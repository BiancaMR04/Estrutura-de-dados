package Exercicio3;

public class Vetor{

    private int totalObjetos = 0;
    private Object[] objetos;

    public void adiciona(Object objeto){
        this.garanteEspaco();
        this.objetos[totalObjetos] = objetos;
        totalObjetos++;

    }

    public int tamanho(){
        return totalObjetos;
    }

    public boolean contem(Object objeto){
        for(int i=0; i<this.totalObjetos; i++){
            if(objeto == this.objetos[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if (totalObjetos == this.objetos.length)
        return true;
        return false;
        }


    private void garanteEspaco(){
        if (this.cheio()){
        Object[] novosObjetos = new Object[this.objetos.length * 2];
        for (int i=0; i < this.objetos.length; i++)
        novosObjetos[i] = this.objetos[i];
        this.objetos = novosObjetos;
        }

    }
	
}
