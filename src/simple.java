import java.util.Scanner;
public class simple {
    public static void main(String[] args) {
        Scanner nam    = new Scanner(System.in);
        Scanner rollno = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = nam.nextLine();
        System.out.print("Enter your Roll No.: ");
        int roll = rollno.nextInt();
        System.out.println("Your name is: "+ name);
        System.out.print("Your roll no. is: "+ roll);
        nam.close();
        rollno.close();
    }
}