
public class stringA {
    public static void main(String[] args) {
        String input = "LearNowx rules";
        
        String result = transform(input);
        System.out.println(result);
    }

    public static String transform(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        // reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            String w = words[i];
            sb.append(w).append(w.length());

            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}
