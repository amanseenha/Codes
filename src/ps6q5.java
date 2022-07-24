public class ps6q5 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int len = arr.length;
        int temp=0;
        int division=Math.floorDiv(len,2);
        for (int i=0;i<division;i++) {
            temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        for (int element:arr) System.out.print(element + " ");
}
}