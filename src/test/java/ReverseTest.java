import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseTest extends StringUtilsTest{
    //Тесты должны проверять:
    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)

    @ParameterizedTest
    @CsvSource({
            "youtube, ebutuoy",
            "abba, abba",
            "'', ''"
    })
    public void stringShouldReverseWithValidString(String initalString, String expectedValue) {
        String actualResult = stringUtilsTest.reverse(initalString);

        assertEquals(expectedValue, actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnNullWhenStringIsNull(String initialString) {
        String actualResult = stringUtilsTest.reverse(initialString);

        assertNull(actualResult);
    }
}
