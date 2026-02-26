public class carryCount {

    public static int countCarries(int a, int b) {
        int carry = 0;
        int count = 0;

        while (a > 0 || b > 0) {
            int d1 = a % 10;
            int d2 = b % 10;

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            a /= 10;
            b /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 675;
        int b = 126;
        System.out.println(countCarries(a, b)); // Output: 2
    }
}
