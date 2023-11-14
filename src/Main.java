public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findMin(new Integer[] {4, 3, 2, 1, -1, -3, -4}));
    }

    public static Integer findMin(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                boolean contains = false;
                for (int n : arr) {
                    if (n == -arr[i]) {
                        contains = true;
                    }
                }
                if (!contains && arr[i] > 0) {
                    return -arr[i];
                }
            }
        }
        return 0;
    }
}