import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends StringUtilsTest{
    //Тесты должны проверять:
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "java, 2",
            "AEIOU, 5",
            "'', 0"
    })
    public void checkVowelsInValueWithVowels(String initialString, int exceptedValue) {
        int actualResult = stringUtilsTest.countVowels(initialString);

        assertEquals(exceptedValue, actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnIllegalArgumentExceptionWhenValueIsNull(String initialString) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> stringUtilsTest.countVowels(initialString));

        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    public void checkVowelsInValueWithoutVowels() {
        int actualResult = stringUtilsTest.countVowels("vbncxz");

        assertEquals(0, actualResult);
    }
}
