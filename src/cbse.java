import java.util.Scanner;

public class cbse {

    public static void main(String[] args) {
        System.out.println("Enter 1st Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        Scanner scb = new Scanner(System.in);
        int b = scb.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();
        scb.close();
    }
}
