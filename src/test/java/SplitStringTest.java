import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringTest extends StringUtilsTest{
    //Тесты:
    //"Java,Python,C++", "," → ["Java", "Python", "C++"]
    //"", "," → [""]
    //"word", "," → ["word"]

    @Test
    public void shouldReturnArrayWithSplitStringsFromStringWithDelimiter() {
        String[] actualResult = stringUtilsTest.splitString("Java,Python,C++", ",");

        assertArrayEquals(new String[]{"Java", "Python", "C++"}, actualResult);
    }

    @Test
    public void shouldReturnArrayWithEmptyStringFromEmptyString() {
        String[] actualResult = stringUtilsTest.splitString("", ",");

        assertArrayEquals(new String[]{""}, actualResult);
    }

    @Test
    public void shouldReturnArrayWithInitialValueFromArrayWithOneVale() {
        String[] actualResult = stringUtilsTest.splitString("word", ",");

        assertArrayEquals(new String[]{"word"}, actualResult);
    }
}
