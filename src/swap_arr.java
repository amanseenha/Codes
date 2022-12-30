import java.util.Scanner;

public class swap_arr {

  public static int[] getInput() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter " + i + "th " + "element: ");
      a[i] = sc.nextInt();
    }
    sc.close();
    return a;
  }

  public static void Print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] swapper(int[] array) {
    int temp = 0;
    for (int i = 0; i < array.length - 1; i += 2) {
      temp = array[i];
      array[i] = array[i + 1];
      array[i + 1] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] arr = getInput();
    Print(arr);
    int[] nArr = swapper(arr);
    System.out.println();
    Print(nArr);
  }
}