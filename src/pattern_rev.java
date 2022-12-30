class pattern{
    static void printPattern(int numLines){
        for (int i = 0; i< numLines; i++){
            for (int j = i+1; j < numLines; j++){
                System.out.print("*");
            }
        }
    }
}
public class pattern_rev {
    public static void main(String[] args) {
        pattern.printPattern(5);
    }
}
