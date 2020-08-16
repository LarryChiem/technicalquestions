import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKDistinctTest {

    @Test
    void findLengthReturns5() {
        LongestSubstringKDistinct longestSubstringKDistinct = new LongestSubstringKDistinct();
        int actual = longestSubstringKDistinct.findLength("AAAHHIBC", 2);
        assertEquals(5, actual);
    }
}