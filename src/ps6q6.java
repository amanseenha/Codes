public class ps6q6 {
    public static void main(String[] args) {
        int [] array={1,43,89,674,93};
        int max=0;
        for (int elements:array) if (elements > max){
            max=elements;
        }
        System.out.println(max);
    }
}