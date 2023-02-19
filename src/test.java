import java.util.Scanner;

public class test {

  public static void main(String[] args) {
    int[][] arr = new int[3][2];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[1][1]);
      }
    }
    sc.close();
  }
}
