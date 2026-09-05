import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAnagramTest extends StringUtilsTest {
    //Тесты:
    //"listen", "silent" → true
    //"java", "python" → false
    //null → false

    public static Stream<Arguments> provideNullPairs() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(null, "abcd"),
                Arguments.of("abcd", null)
        );
    }

    @Test
    public void shouldReturnTrueFromAnagramString() {
        boolean actualResult = stringUtilsTest.isAnagram("listen", "silent");

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseFromNotAnagramString() {
        boolean actualResult = stringUtilsTest.isAnagram("java", "python");

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNullPairs")
    public void shouldReturnFalseFromNull(String firstString, String secondString) {
        boolean actualResult = stringUtilsTest.isAnagram(firstString, secondString);

        assertFalse(actualResult);
    }
}
