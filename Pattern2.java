
public class Pattern2 {
//    a
//  c b d
//    e
//  g f h
//    i

    public static void main(String[] args) {
        int n = 5; // number of rows
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("  " + ch);
                ch++;
            } else {
                char mid = ch;
                char left = (char) (ch + 1);
                char right = (char) (ch + 2);
                System.out.println(left + " " + mid + " " + right);
                ch += 3;
            }
        }
    }
}
