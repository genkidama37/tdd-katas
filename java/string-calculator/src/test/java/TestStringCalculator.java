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
    @DisplayName("Input is two numbers separated by comma")
    void CalculateSumOfTwoNumbers() {
        int result = StringCalculator.add("3,2");
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Input is an unknown amount of numbers separated by comma")
    void CalculateSumOfUnknownAmountOfNumbers() {
        int result = StringCalculator.add("1,2,3,4,5");
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Input contains new lines between numbers")
    void CalculateSumOfUnknownAmountOfNumbersWithNewLineAsSeparator() {
        int result = StringCalculator.add("1\n2,3");
        assertEquals(6, result);
    }
}
