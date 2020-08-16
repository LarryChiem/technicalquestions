import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurencesTest {

    @Test
    void uniqueOccurrencesReturnsTrue() {
        UniqueNumberOfOccurences uniqueNumberOfOccurences = new UniqueNumberOfOccurences();
        boolean actual = uniqueNumberOfOccurences.uniqueOccurrences(new int[]{1,2,2,1,1,3});
        assertEquals(true, actual);
    }


    @Test
    void uniqueOccurrencesReturnsFalse() {
        UniqueNumberOfOccurences uniqueNumberOfOccurences = new UniqueNumberOfOccurences();
        boolean actual = uniqueNumberOfOccurences.uniqueOccurrences(new int[]{1,2});
        assertEquals(false, actual);
    }

    @Test
    void uniqueOccurrencesReturnsTrue2() {
        UniqueNumberOfOccurences uniqueNumberOfOccurences = new UniqueNumberOfOccurences();
        boolean actual = uniqueNumberOfOccurences.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0});
        assertEquals(true, actual);
    }

}