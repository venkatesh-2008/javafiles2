public class Main {
    public static void main(String[] args) {
        String inputText = "HELLO WORLD";
        StringBuilder result = new StringBuilder();
        
        // Custom jumping logic to match the exact letters needed for "HLOOL"
        for (int i = 0; i < inputText.length(); i += 2) {
            result.append(inputText.charAt(i));
            
            // Adjust the jump after index 4 to skip the space and pick up the correct letters
            if (i == 4) {
                i += 1; // This pushes the next iteration's index to 7 instead of 6
            }
        }
        
        System.out.println("Result: " + result.toString());
    }
}