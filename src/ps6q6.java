public class ps6q6 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,568,6,7,8,9,10};
        int max=0;
        for (int j:arr){
            if(j>max){
                max=j;
            }
        }
        System.out.println(max);
    }
}
