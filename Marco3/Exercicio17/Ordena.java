package Marco3.Exercicio17;

public class Ordena {

    public Ordena() {
    }
    
    public void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i = n - 1; i > 0; i--) {
          
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }

        imprime(array);
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        
        if (left < n && array[left] > array[largest])
            largest = left;

        if (right < n && array[right] > array[largest])
            largest = right;

    
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        imprime(array);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
        
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    private void imprime(int[] array) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
