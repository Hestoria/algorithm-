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

    private static void print(int[] input) {
        for(int i = 0 ; i < input.length ; i++){
            System.out.println(input[i]);
        }
    }

    private static int[] sort(int[] input){
        boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;

            for(int i = 0 ; i < input.length - 1 ; i++){
                if(input[i] > input[i+1]){
                    hasSwapped = true;
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }

        }
        return input;

    }
}