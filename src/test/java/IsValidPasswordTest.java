import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPasswordTest extends StringUtilsTest{
    //Тесты:
    //"Password1" → true
    //"pass" → false
    //null → false

    @Test
    public void shouldReturnTrueFromValidPassword() {
        boolean actualResult = stringUtilsTest.isValidPassword("Password1");

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseFromInvalidPassword() {
        boolean actualResult = stringUtilsTest.isValidPassword("pass");

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseFromNull(String initialSting) {
        boolean actualResult = stringUtilsTest.isValidPassword(initialSting);

        assertFalse(actualResult);
    }
}
