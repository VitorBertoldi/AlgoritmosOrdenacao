
public class Main {
    public static void main(String[] args) {
        int arr[] ={49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        QuickSort quickSort = new QuickSort();

        System.out.println("Array inicial");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //bubbleSort.bubbleSort(arr);//sorting array elements using bubble sort
        insertionSort.insertionSort(arr);
        //quickSort.quickSort(arr, 0, arr.length -1);


        System.out.println("Array depois do sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

