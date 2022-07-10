public class ps6q5 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int len= arr.length;
        int n= Math.floorDiv(len,2);
        int temp;
        for (int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        for (int element:arr) System.out.print(element + " ");
}
}