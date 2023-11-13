import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        System.out.println("Realizando o sort ....");
        for(int i = 1; i < arr.length; i++) {
            int valorInicial = arr[i];
            int j = i- 1;
            while (j >= 0 && arr[j] > valorInicial) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = valorInicial;
            System.out.println(Arrays.toString(arr));
        }
    }
}
