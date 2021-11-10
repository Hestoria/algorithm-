package sortingAlgorithms;

import java.util.Random;

public class heapSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[30];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000000);
        }

        System.out.println("Before:");
        print(numbers);

        sort(numbers);

        System.out.println("After:");
        print(numbers);
    }

    
    private static void sort(int[] numbers) {
        int size = numbers.length;
        for(int i = size/2 - 1 ; i >= 0 ; i--){
            heapify(numbers,size,i);
        }
        for(int i= size-1;i>=0;i--) {
                
            int temp = numbers[0];
           
            numbers[0] = numbers[i];
           
            numbers[i] = temp;
            
            heapify(numbers,i,0);
        }
    }


    private static void heapify(int[] numbers, int length, int i) {
        int largest = i ,left = 2* i +1,right = 2*i+2;
        if(left < length && numbers[left] > numbers[largest]){
            largest = left;
        }
        if(right < length && numbers[right] > numbers[largest]){
            largest = right;
        }
        if(largest!= i){
            int temp = numbers[i];
            numbers[i] = numbers[largest];
            numbers[largest] = temp;
            heapify(numbers, length, largest);
        }
    }

    private static void print(int[] input) {
        for(int i = 0 ; i < input.length ; i++){
            System.out.println(input[i]);
        }
    }
}