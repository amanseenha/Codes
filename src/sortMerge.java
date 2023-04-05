import java.util.Arrays;

public class sortMerge {

  public static void main(String[] args) {
    int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    arr = mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static int[] mergeSort(int[] array) {
    if (array.length == 1) {
      return array;
    }
    int mid = array.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

    return sort(left, right);
  }

  public static int[] sort(int[] first, int[] second) {
    int[] mix = new int[first.length + second.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < first.length && j < second.length) {
      if (first[i] < second[j]) {
        mix[k] = first[i];
        i++;
        k++;
      } else if (first[i] > second[j]) {
        mix[k] = second[j];
        j++;
        k++;
      }
    }
    while (i < first.length) {
      mix[k] = first[i];
      i++;
      k++;
    }
    while (j < second.length) {
      mix[k] = second[j];
      j++;
      k++;
    }
    return mix;
  }
}
