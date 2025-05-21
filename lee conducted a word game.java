lee conducted a word game  for his colleagues the game is everyone should  say a word that should not have any repeating characters in it.if a single character is repeated then the particular person can"t continue the game lee finds it difficult to disequalify the person from the gaem sincehe is not able to find the nonrespective characters for all the words help him find the winner of the game by writitng a program to find the first element which is non repertitive le that element must be present anywhetre else in the string in java simplified

public class Solution {
    public static char firstNonRepeatingChar(String word) {
        int[] count = new int[256]; // for ASCII characters

        // Count each character
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < word.length(); i++) {
            if (count[word.charAt(i)] == 1) {
                return word.charAt(i);
            }
        }

        return '-'; // Return '-' if all characters repeat
    }

    public static void main(String[] args) {
        String word = "swiss";

        char result = firstNonRepeatingChar(word);

        if (result == '-') {
            System.out.println("Disqualified! All characters repeat.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}

output:
First non-repeating character: d

