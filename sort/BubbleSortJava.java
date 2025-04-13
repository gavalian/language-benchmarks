
import java.util.Arrays;
import java.util.Random;

public class BubbleSortJava {

    public static void main(String[] args) {
        int[] arr = create(128);
        int iter = 15;
        for(int j = 0; j < iter; j++){
            //int[] arr = {64, 34, 25, 12, 22, 11, 90};
         fill(arr);
          long startTime = System.nanoTime();
            bubbleSort(arr);
          long endTime = System.nanoTime();

          //System.out.println("Sorted array: " + Arrays.toString(arr));
          System.out.println("Time taken in nanoseconds: " + (endTime - startTime));
        }
    }
    public static void fill(int[] array){
        Random r = new Random();
        for(int i = 0; i < array.length; i++){
          array[i] = r.nextInt(2048);
        }
    }
    public static int[] create(int elements){
          int[] array = new int[elements];
          Random r = new Random();
          for(int i = 0; i < elements; i++){
             array[i] = r.nextInt(2048);
          }
          return array;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
