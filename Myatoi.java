public class Myatoi{
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int index = 0;
        int n = s.length();

        // 1. Skip leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // If string consists only of spaces
        if (index == n) {
            return 0;
        }

        // 2. Determine sign
        int sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // 3. Convert digits and check for overflow
        int result = 0;
        while (index < n) {
            char ch = s.charAt(index);
            
            // Stop if non-digit character is encountered
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // Check for 32-bit integer overflow/underflow before multiplying
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}