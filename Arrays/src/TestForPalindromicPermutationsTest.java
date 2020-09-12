import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestForPalindromicPermutationsTest {

    @Test
    void edifiedCanFormPalindromeReturnsTrue() {
        TestForPalindromicPermutations testForPalindromicPermutations = new TestForPalindromicPermutations();
        String input = new String("edified");
        boolean expected = true;
        boolean actual = testForPalindromicPermutations.canFormPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    void rotatorCanFormPalindromeReturnsTrue() {
        TestForPalindromicPermutations testForPalindromicPermutations = new TestForPalindromicPermutations();
        String input = new String("rotator");
        boolean expected = true;
        boolean actual = testForPalindromicPermutations.canFormPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    void rotatorsCanFormPalindromeReturnsFalse() {
        TestForPalindromicPermutations testForPalindromicPermutations = new TestForPalindromicPermutations();
        String input = new String("rotators");
        boolean expected = false;
        boolean actual = testForPalindromicPermutations.canFormPalindrome(input);
        assertEquals(expected, actual);
    }
}