public class fah_cel {

  public static void converter(int s, int e, int w) {
    while (s <= e) {
      float cel = (s - 32) * 5 / 9;
      System.out.println(s + " " + cel);
      s += w;
    }
  }

  public static void main(String[] args) {
    converter(0, 100, 20);
  }
}