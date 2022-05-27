package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    public void sum() {
        // Arrange
        var number1 = 1L;
        var number2 = 1L;
        var expectedValue = 2L;

        // Act
        var result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    public void subtract() {
        // Arrange
        var number1 = 5L;
        var number2 = 3L;
        var expectedValue = 2L;

        // Act
        var result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    public void multiply() {
        // Arrange
        var number1 = 100L;
        var number2 = 10L;
        var expectedValue = 1000L;

        // Act
        var result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    public void divide() {
        // Arrange
        var number1 = 24L;
        var number2 = 6L;
        var expectedValue = 4L;

        // Act
        var result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}
