import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJsonTest extends StringUtilsTest{
    //Тесты:
    //"{"key":"value"}" → true
    //"invalid json" → false
    //null → false

    @Test
    public void shouldReturnTrueFromValidJson() {
        boolean actualResult = stringUtilsTest.isValidJson("{\"key\":\"value\"}");

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseFromInvalidJson() {
        boolean actualResult = stringUtilsTest.isValidJson("invalid json");

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseFromNull(String initialString) {
        boolean actualResult = stringUtilsTest.isValidJson(initialString);

        assertFalse(actualResult);
    }
}
