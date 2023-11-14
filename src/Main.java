import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        cutBamboos(input);
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

    public static void loopingBamboos (Integer [] intArrBamboos){
        for (int i = 0; i < intArrBamboos.length; i++) {
            System.out.print("|");
            for (int j = 0; j < intArrBamboos[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}