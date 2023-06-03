/**
 * Classe que define a interface de uma pilha.  
 */
public interface IPilha {
    public void push(Object info);
    public Object pop();
    public Object top();
    public boolean isEmpty();
    public int size();

}
