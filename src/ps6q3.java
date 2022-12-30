public class ps6q3 {
    public static void main(String[] args)
    {
        int [] marks ={45,67,100,98,87,56};
        int sum=0;
        for (int element : marks)
        {
            sum += element;
        }
        System.out.println("Average marks in PHYSICS = "+(float) sum/6);
    }
}
