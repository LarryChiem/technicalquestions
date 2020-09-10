import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchCyclicallySortedArrayTest {

    @Test
    void searchSmallest() {
        SearchCyclicallySortedArray searchCyclicallySortedArray = new SearchCyclicallySortedArray();
        List<Integer> A = new ArrayList<>();
        A.add(378);
        A.add(478);
        A.add(550);
        A.add(631);
        A.add(103);
        A.add(203);
        A.add(220);
        A.add(234);
        A.add(279);
        A.add(368);
        int actual = searchCyclicallySortedArray.searchSmallest(A);
        int expected = 4;
        assertEquals(expected, actual);
    }
}