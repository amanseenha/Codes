import java.util.Scanner;
public class psleap {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner user = new Scanner(System.in);
        int year = user.nextInt();
       if ((year%4)==0) {
           System.out.println("Leap Year");
       }
        else{
               System.out.println("Not Leap Year");
           }
           user.close();
    }
}
