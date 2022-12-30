public class ps6q2 {
    public static void main(String[] args) {
       int [] num = {2,4,5,6,7,8};
       for (int i=0;i<=num.length-1;i++){
           if (num[i]==7){
               System.out.println("found at index "+ i);
           }
           else {
               System.out.println("not found");
           }
       }
    }
}
