package sortingAlgorithms;

import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000000);
        }

        System.out.println("Before:");
        print(numbers);

        sort(numbers,0,numbers.length-1);

        System.out.println("After:");
        print(numbers);
    }
    
    public static void sort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
    
            sort(arr, begin, partitionIndex-1);
            sort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
    
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
    
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
    
        return i+1;
    }

    private static void print(int[] input) {
        for(int i = 0 ; i < input.length ; i++){
            System.out.println(input[i]);
        }
    }
}