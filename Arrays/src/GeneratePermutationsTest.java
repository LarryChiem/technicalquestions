
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class GeneratePermutationsTest {

    @Test
    void permutations() {
        GeneratePermutations generatePermutations = new GeneratePermutations();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(5);
        List<List<Integer>> actual = generatePermutations.permutations(list);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(7, 3, 5));
        expected.add(Arrays.asList(7, 5, 3));
        expected.add(Arrays.asList(3, 7, 5));
        expected.add(Arrays.asList(3, 5, 7));
        expected.add(Arrays.asList(5, 3, 7));
        expected.add(Arrays.asList(5, 7, 3));
        assertEquals(expected, actual);
    }
}