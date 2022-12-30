public class SmallestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1, m = 0;
        while (s <= e) {
            m = (s + e) / 2;
            if (letters[m] > target) {
                e = m - 1;
                m = (s + e) / 2;
            } else {
                s = m + 1;
                m = (s + e) / 2;
            }
        }
        return letters[s % letters.length];
    }
}