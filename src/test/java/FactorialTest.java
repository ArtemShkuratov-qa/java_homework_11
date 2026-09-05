import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MathUtilsTest{
    //Тесты должны проверять:
    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)

    @Test
    public void shouldReturnOneWhenValueIsZero() {
        int actualResult = mathUtilsTest.factorial(0);

        assertEquals(1, actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "5, 120",
            "7, 5040"
    })
    public void shouldCalculateFactorialForPositiveNumbers(int initialNumber, int expected) {
        int actualResult = mathUtilsTest.factorial(initialNumber);

        assertEquals(expected, actualResult);
    }

    @Test
    public void shouldReturnExceptionForNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> mathUtilsTest.factorial(-1));

        assertEquals("Negative numbers not allowed", exception.getMessage());
    }
}
