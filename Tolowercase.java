public class Tolowercase{
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is an uppercase letter
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert to lowercase by adding 32 (or using bitwise OR: chars[i] |= 32)
                chars[i] = (char) (chars[i] + 32);
            }
        }
        