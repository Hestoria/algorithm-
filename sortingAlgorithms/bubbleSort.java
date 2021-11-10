package sortingAlgorithms;
import java.util.Random;

public class bubbleSort{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];

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
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
    }

    private static int[] sort(int[] numbers){
        boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;

            for(int i = 0 ; i < numbers.length - 1 ; i++){
                if(numbers[i] > numbers[i+1]){
                    hasSwapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }

        }
        return numbers;

    }
}