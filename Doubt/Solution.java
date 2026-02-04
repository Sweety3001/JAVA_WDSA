// 1->
// you are given a string as you must convert it into a integer following some strict rules
// ->ignore leading spaces
// ->check signs +/-
// ->read digits until a non digit is found
// -> if number goes out of the integer range you have to clamp it
// ->if no digits just return zero
// ex- hello123
// output-0

// ex-12@hello123
// output-12

// ex-12@1244
// output-12

//lc 8
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int res=0;
        int n=s.length();
        int sign=1;
        int i=0;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=(s.charAt(i)=='+')?1:-1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if (res > Integer.MAX_VALUE / 10 ||
               (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res=res*10+digit;
            
            i++;
        }
        return res*sign;

    }
}