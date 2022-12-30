import java.util.Scanner;

public class prs2q2 {
    public static void main(String[] args) {
        System.out.println("Enter Grade");
        Scanner gr = new Scanner(System.in);
        char grade = gr.next().charAt(0);
        grade = (char) (grade + 8);
        System.out.println("Your Encrypted Grade is = " + grade);

        grade = (char) (grade - 8);
        System.out.println("Your Decrypted Grade is = " + grade);
        gr.close();
    }

}
