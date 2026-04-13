import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestStringCalculator {
    @Test
    @DisplayName("Input is empty string")
    void CalculateEmptyString() {
        int result = StringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Input is one number")
    void CalculateSumOfOneNumber() {
        int result = StringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Input is two positive numbers separated by comma")
    void CalculateSumOfTwoPositiveNumbers() {
        int result = StringCalculator.add("3,2");
        assertEquals(5, result);
    }
}
