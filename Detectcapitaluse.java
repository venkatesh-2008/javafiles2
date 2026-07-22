public class Detectcapitaluse {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();
        
        // Count the total number of uppercase letters
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        
        // Case 1: All capital letters (e.g., "USA")
        if (count == n) {
            return true;
        }
        
        // Case 2: All lowercase letters (e.g., "leetcode")
        if (count == 0) {
            return true;
        }
        
        // Case 3: Only the first letter is capital (e.g., "Google")
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        
        return false;
    }
}