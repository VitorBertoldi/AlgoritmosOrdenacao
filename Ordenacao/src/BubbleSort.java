import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        System.out.println("Realizando o sort ....");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));

            }
        }
    }
}


