public class factorial{
    int getFactorial(int num){
        if (num == 0 || num ==1){
            return 1;
        }
        int f = num*getFactorial(num-1);
        System.out.print(f + " ");
        return f;
    }
    public static void main(String[] args) {
      factorial object = new factorial();
      object.getFactorial(10);
    }
}