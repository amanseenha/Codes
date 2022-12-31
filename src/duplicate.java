import java.util.Scanner;

public class duplicate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter element " + (i + 1));
      arr[i] = sc.nextInt();
    }
    int i = 0;
    while (i < arr.length) {
      int j = i + 1;
      while (j < arr.length) {
        if (arr[i] == arr[j]) {
          System.out.println("Duplicate " + arr[i]);
        }
        j++;
      }
      i++;
    }
    sc.close();
  }
}
