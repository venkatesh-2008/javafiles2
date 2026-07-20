public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        
        // Start scanning from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                // If we hit a space and have already counted characters,
                // we have finished processing the last word.
                if (length > 0) {
                    return length;
                }
            }
        }
        
        return length;
    }
}