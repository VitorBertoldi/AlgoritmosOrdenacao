import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr,int nEsquerda, int nDireita) {
        if (nEsquerda >= nDireita) {
            return;
        }

        int pivot = arr[nDireita]; //ultimo numero do array
        int pointerEsquerda = nEsquerda;
        int pointerDireita = nDireita;
        while (pointerEsquerda < pointerDireita) {
            while (arr[pointerEsquerda] <= pivot && pointerEsquerda < pointerDireita) {
                pointerEsquerda++;
            }
            while (arr[pointerDireita] >= pivot && pointerEsquerda < pointerDireita) {
                pointerDireita--;
            }
            trocar(arr,pointerEsquerda, pointerDireita);
        }
        trocar(arr, pointerEsquerda, nDireita);
        System.out.println(Arrays.toString(arr));
        quickSort(arr, nEsquerda, pointerEsquerda - 1);
        quickSort(arr, pointerEsquerda + 1, nDireita );
    }

    public static void trocar(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
