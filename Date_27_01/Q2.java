
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String consonant = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String vowel = "AEIOUaeiou";
        int vc = 0;
        int cc = 0;
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if (consonant.indexOf(ch) != -1) {
                cc++;
            } else if (vowel.indexOf(ch) != -1) {
                vc++;
            }
        }
        System.out.println("Consonant count: " + cc);
        System.out.println("Vowel count: " + vc);
    }
}
//wap to count vowels and consonant in a give string that might contain special character, number
//sample string:- "abhhska@gmail.com sadlk"

