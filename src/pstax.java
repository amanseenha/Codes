import java.util.Scanner;
public class pstax {
    public static void main(String[] args) {
        System.out.println("Enter income in complete figures");
        Scanner inc = new Scanner(System.in);
        long income = inc.nextLong();
        if (income>=250000 && income<500000){
            System.out.println(income-(5*income/100) +" Itna TAX dena hai");
        }
        else if (income>=500000 && income<1000000) {
            System.out.println(income-(20*income/100) +" Itna TAX dena hai");
        }
        else if (income>=1000000){
            System.out.println(income-(30*income/100) +" Itna TAX dena hai");
        }
        else {
            System.out.println("NO TAX Enjoy!");
        }
        inc.close();
    }
}
