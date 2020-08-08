import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isPalindromeTest {

    @Test
    void isPalindromeReturnsTrue() {
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean actual = isPalindrome.isPalindrome("A man, a plan, a canal, Panama.");
        assertEquals(true, actual);
    }

    @Test
    void isPalindromeReturnsTrue2() {
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean actual = isPalindrome.isPalindrome("Able was I, ere I saw\nElba!");
        assertEquals(true, actual);
    }

    @Test
    void isPalindromeReturnsFalse() {
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean actual = isPalindrome.isPalindrome("Ray a Ray");
        assertEquals(false, actual);
    }
}