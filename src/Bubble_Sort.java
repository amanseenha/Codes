public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,8,3,5,9,2,2};
        for (int i =0; i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
