import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends MathUtilsTest{
    //Тесты должны проверять:
    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)
    public static Stream<Arguments> arrayForPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{-6, -2, 3, 4, 10}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayForPositiveCases")
    public void shouldReturnSecondMaxValue(int[] initialArray, int expectedResult) {
        int actualResult = mathUtilsTest.findSecondMax(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnNoSuchElementExceptionFromArrayWithSameElements() {
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> mathUtilsTest.findSecondMax(new int[]{1, 2, 3, 3, 3, 5, 5, 5, 10, 7}));

        assertEquals("No value present", exception.getMessage());
    }

    @Test
    public void shouldReturnIllegalArgumentExceptionFromArrayWithOneElement() {
        assertThrows(IllegalArgumentException.class, () -> mathUtilsTest.findSecondMax(new int[]{5}));
    }
}
