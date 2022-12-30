import java.util.Scanner;
public class psloopq2 {
    public static void main(String[] args) {
        System.out.println("Enter Marks in PCM order");
        Scanner p = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        float phy= p.nextInt();
        float che= c.nextInt();
        float mat= m.nextInt();
        float result = (phy+che+mat)/3f;
        if (phy >=33 && che>=33 && mat>=33 && result>=40 && phy<=100 && che<=100 && mat<=100){
            System.out.println("Pass "+result+"%");
        }
        else if (phy>100 || che>100 || mat>100){
            System.out.println("Wrong Input");
        }
        else{
            System.out.println("Fail "+result+"%");
        }
        p.close();
        c.close();
        m.close();
    }
}

