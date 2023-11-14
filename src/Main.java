import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(new Integer[] {0, 2, 4, -1, -3, -4}));
    }

    public static Integer findMin(Integer[] arr) {
        Integer[] arr2 = arr;
        Arrays.sort(arr2);

        int min = arr2[0];

        for (int i=-1; i>=min; i--) {
            boolean contains = false;
            for (int n : arr2) {
                if (n == i) {
                    contains = true;
                }
            }
            if (!contains) return i;
        }

        return 0;
    }
}