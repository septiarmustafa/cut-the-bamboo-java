import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu");
            System.out.println("1. [Challenge 8.4] Angka Terbesar dan Terkecil");
            System.out.println("2. [Challenge 8.5] Mencari angka minus terbesar yang hilang");
            System.out.println("3. Live Code - Cut The Bamboo");
            System.out.println("4. Exit");
            System.out.print("Choose menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                // [Challenge 8.4] Angka Terbesar dan Terkecil
                System.out.print("Input array length: ");
                int arr_count = input.nextInt();
                System.out.printf("Input %s array item: \n", arr_count);
                int [] arr = new int[arr_count];
                for (int i = 0; i < arr_count ; i++) {
                    arr[i] = input.nextInt();
                }
                findMinMax(arr);

            } else if (menu == 2) {
                // [Challenge 8.5] Mencari angka minus terbesar yang hilang
                System.out.println(findMin(new Integer[] {0, 2, 4, -1, -3, -4}));

            } else if (menu == 3) {
                // Live Code - Cut The Bamboo
                input.nextLine();
                cutBamboos(input);

            } else if (menu == 4) {
                System.out.println("Exiting Program...");
                break;
            } else {
                System.out.println("Invalid input!\n");
            }
        }
    }

    public static void cutBamboos(Scanner input) {
        System.out.print("bamboos: ");
        String bamboos = input.nextLine();
        System.out.print("cuts: ");
        Integer cycleCuts = input.nextInt();

        String[] arrBamboos = bamboos.split(",");
        Integer[] intArrBamboos = new Integer[arrBamboos.length];

        for (int i = 0; i < arrBamboos.length; i++) {
            intArrBamboos[i] = Integer.parseInt(arrBamboos[i].trim());
        }
        System.out.println("initials:");
        loopingBamboos(intArrBamboos);
        Integer index=1;
        do {
            for (int i = 0; i < intArrBamboos.length; i++) {
                intArrBamboos[i] = intArrBamboos[i] - 1;
            }
            System.out.println("cycle cuts: "+ index++);
            loopingBamboos(intArrBamboos);

            cycleCuts--;
        } while (cycleCuts > 0);
    }

    public static void loopingBamboos (Integer [] intArrBamboos) {
        for (int i = 0; i < intArrBamboos.length; i++) {
            System.out.print("|");
            for (int j = 0; j < intArrBamboos[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Integer findMin(Integer[] arr) {
        Arrays.sort(arr);
        int min = arr[0];

        for (int i=-1; i>=min; i--) {
            boolean contains = false;
            for (int n : arr) {
                if (n == i) {
                    contains = true;
                }
            }
            if (!contains) return i;
        }

        return 0;
    }

    public static void findMinMax(int[] arr) {

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

