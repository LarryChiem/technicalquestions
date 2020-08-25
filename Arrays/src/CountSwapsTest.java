import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSwapsTest {

    @Test
    void countSwaps() {
        CountSwaps fun = new CountSwaps();
        int actual = fun.countSwaps(new int[]{3,2,1});
        assertEquals(3, actual);
    }
}