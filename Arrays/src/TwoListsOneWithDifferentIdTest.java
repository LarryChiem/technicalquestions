import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoListsOneWithDifferentIdTest {

    @Test
    void solutionReturns6() {
        TwoListsOneWithDifferentId twoListsOneWithDifferentId = new TwoListsOneWithDifferentId();
        int actual = twoListsOneWithDifferentId.solution(new int[]{13, 5, 6, 2, 5}, new int[]{5, 2, 5, 13});
        assertEquals(6, actual);
    }


    @Test
    void solutionReturnsNeg4() {
        TwoListsOneWithDifferentId twoListsOneWithDifferentId = new TwoListsOneWithDifferentId();
        int actual = twoListsOneWithDifferentId.solution(new int[]{14, 27, 1, 4, 2, 50, 3, 1}, new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50});
        assertEquals(-4, actual);
    }
}