public class fill_array{
    public static void Increment(int []input){
           input = new int[7];
        for (int i = 0; i < input.length; i++) {
            input[i]=input[i]+1;
            System.out.println(input[i]);
        }
    }
    public static void main(String[] args) {
        int [] i ={1,2,3,4,5};
        Increment(i);
        
    }
}