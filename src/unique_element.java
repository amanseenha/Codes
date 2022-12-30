public class unique_element {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 6, 3, 1, 6, 2 };
    int dupIn = -1;
    int i = 0;
    while (i != dupIn) {
      int j = i + 1;
      while (j < 7) {
        if (arr[i] == arr[j]) {
          dupIn = i;
          j++;
        }
      }
      i++;
    }
  }
}
