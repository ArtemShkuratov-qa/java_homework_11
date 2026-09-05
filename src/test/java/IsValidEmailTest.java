import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends StringUtilsTest{
    //Тесты должны проверять:
    //Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    //null

    @Test
    public void shouldReturnTrueWhenEmailIsValid() {
        boolean isValid = stringUtilsTest.isValidEmail("test@example.com");

        assertTrue(isValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol"})
    public void shouldReturnFalseWhenEmailIsInvalid(String initialString) {
        boolean isValid = stringUtilsTest.isValidEmail(initialString);

        assertFalse(isValid);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenValueIsNull(String initialString) {
        boolean isValid = stringUtilsTest.isValidEmail(initialString);

        assertFalse(isValid);
    }
}
