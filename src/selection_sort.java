public class selection_sort {
  public static void selectionSort(int[] a) {
    for (int i = 0; i < a.length-1; i++) {
      int minIndex = -1;
      int min = Integer.MAX_VALUE;
      for (int j = i; j < a.length; j++) {
        if (min > a[j]) {
          min = a[j];
          minIndex = j;
        }
      }
      int temp = a[minIndex];
      a[minIndex] = a[i];
      a[i] = temp;
    }
    for (int i : a) {
      System.out.print(i+" ");
    }
  }
  public static void main(String[] args) {
    int[] a = { 1, 3, 0, 4, 2, 7, 6 };
    selectionSort(a);
  }
}