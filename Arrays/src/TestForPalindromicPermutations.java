import java.util.HashMap;
import java.util.Map;

/* 13.1 TEST FOR PALINDROMIC PERMUTATIONS
A palindrome is a string that reads the same forwards and backwards, e.g., "level",
"rotator", and "foobaraboof".
Write a program to test whether the lettersforming a string can be permuted to form
a palindrome. For example, "edified" can be permuted to form "deified".
Hint: Find a simple characterization of strings that can be permuted to form a palindrome
 */

public class TestForPalindromicPermutations {
    public static boolean canFormPalindrome(String s) {
       Map<Character, Integer> charFrequencies = new HashMap<>();
       // Compute the frequency of each char in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!charFrequencies.containsKey(ch)) {
               charFrequencies.put(ch, 1);
            } else {
                charFrequencies.put(ch, charFrequencies.get(ch) + 1);
            }
        }

        // A string can be permutated as a palindrome if and only if the number of odd chars
        // whose frequencies is odd is at most 1
        int oddCount = 0;
        for (Map.Entry<Character, Integer> p : charFrequencies.entrySet()) {
            if ((p.getValue() % 2) != 0 && ++oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
