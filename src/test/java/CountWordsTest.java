import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends StringUtilsTest{
    //Тесты должны проверять:
    //Пустую строку
    //null
    //Строку с несколькими пробелами

    @Test
    public void shouldReturnCorrectWordCount() {
        int actualResult = stringUtilsTest.countWords("One two three four five");

        assertEquals(5, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "        "})
    public void shouldReturnZeroFromEmptyOrBlankStrings(String initalString) {
        int actualResult = stringUtilsTest.countWords(initalString);

        assertEquals(0, actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnNullPointerExceptionFromNull(String initialString) {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> stringUtilsTest.countWords(initialString));

        assertEquals("Cannot invoke \"String.trim()\" because \"sentence\" is null", exception.getMessage());
    }
}
