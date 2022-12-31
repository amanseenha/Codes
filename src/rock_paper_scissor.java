import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println("0 = Rock\n1 = Paper\n2= Scissor");
        Scanner choice = new Scanner(System.in);
        int user = choice.nextInt();
        Random random = new Random();
        int x = random.nextInt(3);
        if (user == x) {
            System.out.println("Tie");
        } else if (user == 2 && x == 0) {
            System.out.println("Computer Wins");
        } else if (user == 0 && x == 2) {
            System.out.println("You Win");
        } else if (user > x && user < 3) {
            System.out.println("You Win");
        }
        else if (x > user) {
            System.out.println("Computer Wins");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("The computer chose "+ x);
        choice.close();
    }
}
