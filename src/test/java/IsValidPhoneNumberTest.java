import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPhoneNumberTest extends StringUtilsTest {
    //Тесты должны проверять:
    //Корректные номера ("+1 1234567890")
    //Некорректные номера ("12345", "invalid")

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+3 1234567890"})
    public void shouldReturnTrueFromValidNumber(String initalString) {
        boolean actualResult = stringUtilsTest.isValidPhoneNumber(initalString);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid"})
    public void shouldReturnFalseFromValidNumber(String initalString) {
        boolean actualResult = stringUtilsTest.isValidPhoneNumber(initalString);

        assertFalse(actualResult);
    }

}
