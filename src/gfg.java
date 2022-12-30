public class gfg{
    public static void main(String[] args) {
        String ch = "Aman", nch="";
        char b;
        for (int i = 0; i < ch.length(); i++) {
            b = ch.charAt(i);
            nch = b+nch;
        }
        System.out.println(nch);
    }
}