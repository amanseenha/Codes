import java.util.Scanner;

public class psweb {
    public static void main(String[] args) {
        System.out.println("Enter domain");
        Scanner inp = new Scanner(System.in);
        String user = inp.nextLine();
        switch (user) {
            case ".com" -> System.out.println("Commercial Website");
            case ".org" -> System.out.println("Organisation Website");
            case ".in" -> System.out.println("Indian Website");
            default -> System.out.println("Enter out of .com .org OR .in");
        }
        inp.close();
    }
}
