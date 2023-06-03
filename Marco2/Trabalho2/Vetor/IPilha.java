package Marco2.Trabalho2.Vetor;

/**
 * Classe que define a interface de uma pilha.  
 */
public interface IPilha {
    public boolean push(Object info);
    public Object pop();
    public Object top();
    public boolean isEmpty();
    public int size();
}
