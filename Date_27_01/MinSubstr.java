import java.util.*;

public class MinSubstr {
    public static void main(String[] args) {
        String s = "aabbabaadcbbcab";
        String p = "abc";
        int n = s.length();
        int m = p.length();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : p.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        HashMap<Character, Integer> freq1 = new HashMap<>(freq);
        int i = 0;
        while ( i < n - m ) {
            if (freq1.isEmpty()) {
                HashMap<Character, Integer> freq2 = new HashMap<>(freq);
                for (int j = i - 1; j >= start; j--) {
                    char c = s.charAt(j);
                    if (freq2.containsKey(c)) {
                        int value = freq2.get(c);
                        value--;
                        if (value == 0) {
                            freq2.remove(c);
                        }
                    }
                    if(freq2.isEmpty()){
                        System.out.println(j+ " "+ (i-1));
                        start = j+1;
                        freq1 = new HashMap<>(freq);
                        break;
                    }
                }
                i=start-1;
            }
            char c = s.charAt(i);
            if (freq1.containsKey(c)) {
                int value = freq1.get(c);
                value--;
                if (value == 0) {
                    freq1.remove(c);
                }
            }
            i++;
        }
    }
}