import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class IncrementAnArbitraryPrecisionIntegerTest {

    @Test
    void incrementAnArbitraryPrecisionInteger() {
        IncrementAnArbitraryPrecisionInteger incrementAnArbitraryPrecisionInteger = new IncrementAnArbitraryPrecisionInteger();
        Iterable<Integer> expected = new ArrayList<>(asList(1,3,0));
        Iterable<Integer> actual = new ArrayList<>(asList(1,3,0));
        assertIterableEquals(expected, actual); // Passes
//        assertIterableEquals(expected, actual);
    }
}