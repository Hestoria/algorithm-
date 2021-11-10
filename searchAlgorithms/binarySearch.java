package searchAlgorithms;

public class binarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int searchVal = 20;
        for(int i = 0 ; i < numbers.length ; i ++){
            numbers[i] = i+1;
        } 
        print(numbers);
        int index = search(numbers, searchVal);
        if( index== -1){
            System.out.println("NOT FOUNDED");
        }else{
            System.out.println("the index of "+searchVal+" is "+index);
        }
    }

    private static void print(int[] input) {
        for(int i = 0 ; i < input.length ; i++){
            System.out.print(input[i]+" ");
        }
    }

    private static void print(int[] input,int start, int last) {
        System.out.println();
        for(int i = start ; i < last ; i++){
            System.out.print(input[i]+" ");
        }
    }

    private static int search(int[] list, int searchVal){
        int start = 0, last = list.length-1, mid = last/2;
        
        while (start<=last) {
            if(list[mid] == searchVal){
                return mid;                
            }else if (list[mid] < searchVal ){
                start = mid + 1;
            }else{
                last = mid-1;
            }
            print(list, start, last);
            mid = (start+last)/2;
        }
        return -1;
    }
}
