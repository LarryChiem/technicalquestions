import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitsTest {

    @Test
    void reverseDigitsPositive() {
        ReverseDigits reverseDigits = new ReverseDigits();
        int expected = 24;
        int output = reverseDigits.reverseDigits(42);
        assertEquals(expected, output);
    }

    @Test
    void reverseDigitsNegative() {
        ReverseDigits reverseDigits = new ReverseDigits();
        int expected = -24;
        int output = reverseDigits.reverseDigits(-42);
        assertEquals(expected, output);
    }
}