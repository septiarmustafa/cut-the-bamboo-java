
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int arr_count = input.nextInt();
        int [] arr = new int[arr_count];
        for (int i = 0; i < arr_count ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findMinMax(arr, input);

    }

    public static void findMinMax(int[] arr, Scanner input) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Max : %d Min : %d",max,min);
    }
}

