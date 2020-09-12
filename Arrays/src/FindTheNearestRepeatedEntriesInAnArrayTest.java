import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class FindTheNearestRepeatedEntriesInAnArrayTest {

    @Test
    void findNearestRepetition() {
        FindTheNearestRepeatedEntriesInAnArray findTheNearestRepeatedEntriesInAnArray = new FindTheNearestRepeatedEntriesInAnArray();
        List<String> paragraph = Stream.of("All", "work", "and", "no", "play",
                "makes", "for", "no", "work", "no", "fun", "and", "no", "results").collect(Collectors.toList());
        int expected = 2;
        int actual = findTheNearestRepeatedEntriesInAnArray.findNearestRepetition(paragraph);
        assertEquals(expected, actual);
    }
}