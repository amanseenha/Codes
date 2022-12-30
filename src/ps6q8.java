public class ps6q8 {
    public static void main(String[] args) {
        int [] array={1,3,6,21,53,55,56};
        boolean isSorted=true;
        for (int i=0;i< array.length-1;i++){
            if (array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted == false){
            System.out.print("Not Sorted");
        }
        else {
            System.out.print("Sorted");
        }
    }
}
