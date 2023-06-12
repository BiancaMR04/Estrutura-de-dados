package Marco2.Exercicio10;

public class Main {

    public static void main(String[] args){
        FilaVet fila = new FilaVet(5);
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println("Tamanho da fila: " + fila.size());
        fila.printe();
        System.out.println("--------------------");

        fila.remove();
        fila.remove();
        fila.printe();

        System.out.println("--------------------");

        fila.add(6);
        fila.add(7);
        fila.printe();
        
    }
    
}
