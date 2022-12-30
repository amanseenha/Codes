public class ps6q1 {
    public static void main(String[] args)
    {
        float [] num = {1.4f,4.5f,5.0f,8.7f,3.2f};
        float sum=0;
        for (int j=0;j<=4;j++)
        {
        sum += num[j];
        }
        System.out.printf("The sum of the array elements is %.1f",sum);
    }
}
