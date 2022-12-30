import java.util.Scanner;

public class Binary_Search {

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
    int s = 0, e = arr.length - 1, m = 0;
    while (s <= e) {
      m = (s + e) / 2;
      if (arr[m] > k) {
        e = m - 1;
        m = (s + e) / 2;
      } else if (arr[m] < k) {
        s = m + 1;
        m = (s + e) / 2;
      } else if (arr[m] == k) {
        return m;
      }
    }
    return -1;
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
