package sortingAlgorithms;
import java.util.Random;

public class mergeSort{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000000];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000000);
        }

        System.out.println("Before:");
        print(numbers);

        sort(numbers);

        System.out.println("After:");
        print(numbers);
    }

    private static void print(int[] numbers) {
        for(int i = 0 ; i < 100 ; i++){
            System.out.println(numbers[i]);
        }
    }

    private static void sort(int[] numbers){
        int inputLength = numbers.length;

        if(inputLength<2) return;
        
        int midIndex = inputLength/2;
        int[] left = new int[midIndex];
        int[] right = new int[inputLength-midIndex];

        for(int i = 0 ; i < midIndex; i++){
            left[i] = numbers[i];
        }

        for(int i = midIndex; i < inputLength; i ++){
            right[i-midIndex] = numbers[i];
        }

        sort(left);
        sort(right);

        merge(numbers, left, right);
    }

    private static void merge(int[] numbers, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;

        int i=0,j=0,k=0;

        while(i<leftSize && j<rightSize){
            if(left[i] <= right[j]){
                numbers[k] = left[i];
                i++;
            }else{
                numbers[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            numbers[k] = left[i];
            i++;
            k++;
        }

        while(j < rightSize){
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}