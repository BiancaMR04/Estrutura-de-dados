package Marco2.Trabalho2.LSE;

/**
 * Classe que define a interface de uma pilha.  
 */
public interface IPilha {
    public void push(Object info);
    public Object pop();
    public Object top();
    public boolean isEmpty();
    public int size();
    public Pilha inverte();
    public String imprime();

}
