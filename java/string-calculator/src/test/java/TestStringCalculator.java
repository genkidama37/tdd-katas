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
}
