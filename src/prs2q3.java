import java.util.Scanner;

public class prs2q3 {
    public static void main(String[] args) {
        int a = 10;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ab.nextInt();
        if (num > a) {
            System.out.println("Entered Number is Greater.");
        } else {
            System.out.println("Entered Number is Smaller.");
        }
        ab.close();
    }
}
