import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends MathUtilsTest{
    //Тесты должны проверять:
    //Обычный массив ([3, 5, 7, 2])
    //Один элемент в массиве
    //Отрицательные числа
    //Пустой массив (должно выбрасываться исключение)

    public static Stream<Arguments> arrayForPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-10, -5, 0, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayForPositiveCases")
    public void shouldReturnMaxFromArrayWithNumbers(int[] initialArray, int exceptedValue) {
        int maxElement = mathUtilsTest.findMax(initialArray);

        assertEquals(exceptedValue, maxElement);
    }

    @Test
    public void shouldReturnNoSuchElementExceptionFromEmptyArray() {
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> mathUtilsTest.findMax(new int[]{}));

        assertEquals("No value present", exception.getMessage());
    }

}
