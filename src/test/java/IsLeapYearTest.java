import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends MathUtilsTest{
    //Тесты должны проверять:
    //Обычные годы
    //Високосные (2020, 2000, 1600)
    //Года, которые делятся на 100, но не на 400 (1900, 2100)

    @ParameterizedTest
    @ValueSource(ints = {1991, 2001, 2005, 1900, 2100})
    public void shouldReturnFalseForNotLeapYears(int initialYear) {
        boolean isLeap = mathUtilsTest.isLeapYear(initialYear);

        assertFalse(isLeap);
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void shouldReturnTrueForLeapYears(int initialYear) {
        boolean isLeap = mathUtilsTest.isLeapYear(initialYear);

        assertTrue(isLeap);
    }
}
