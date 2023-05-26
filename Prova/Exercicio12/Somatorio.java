package Prova.Exercicio12;

public class Somatorio {
    
    public Somatorio(){
        
    }
    
    public int sm(int n){
        if(n==0){
           return n;
        }
        else{
            return n + sm(n-1);
        }
    }
}
