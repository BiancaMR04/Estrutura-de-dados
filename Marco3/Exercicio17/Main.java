package Marco3.Exercicio17;

public class Main {
    public static void main(String[] args) {
        int[] arrayDesordenado = { 9, 4, 2, 7, 5, 1, 8, 3 };

        Ordena lista = new Ordena();

        System.out.println("Heap Sort:");
        lista.heapSort(arrayDesordenado.clone()); 
        System.out.println();

        System.out.println("Quick Sort:");
        lista.quickSort(arrayDesordenado.clone()); 
    }
}
