import java.util.Scanner;

public class ceiling_of_number {

    public static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static int search(int[] arr, int k) {
        int s = 0, e = arr.length - 1;
        if (k > arr[arr.length - 1]) {
            return -1;
        }
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] > k) {
                e = m - 1;
            } else if (arr[m] < k) {
                s = m + 1;
            } else if (arr[m] == k) {
                return arr[m];
            }
        }
        return arr[s];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find: ");
        int[] arr = { 1, 4, 6, 10, 15, 20, 21, 24 };
        int el = sc.nextInt();
        System.out.println(search(sortArray(arr), el));
        sc.close();
    }
}
