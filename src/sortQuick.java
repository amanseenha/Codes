import java.util.Arrays;

public class sortQuick {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    QuickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void QuickSort(int[] arr, int start, int end) {
    if (start < end) {
      int pIndex = partition(arr, start, end);
      QuickSort(arr, start, pIndex - 1);
      QuickSort(arr, pIndex + 1, end);
    }
  }

  public static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int pIndex = start;
    for (int i = start; i < end; i++) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
        pIndex += 1;
      }
    }
    int temp = arr[pIndex];
    arr[pIndex] = arr[end];
    arr[end] = temp;
    return pIndex;
  }
}