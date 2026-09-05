import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest extends MathUtilsTest {
    //Тесты:
    //[1, 2, 3, 4, 5] → 3.0
    //[10] → 10.0
    //Пустой массив (должно выбрасываться исключение)

    @Test
    public void shouldReturnAverageFromValidArray() {
        double actualResult = mathUtilsTest.findAverage(new int[]{1, 2, 3, 4, 5});

        assertEquals(3.0, actualResult);
    }

    @Test
    public void shouldReturnSameElementWhenArrayHasOneValue() {
        double actualResult = mathUtilsTest.findAverage(new int[]{10});

        assertEquals(10, actualResult);
    }

    @Test
    public void shouldReturnExceptionFromArrayIsEmpty() {
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> mathUtilsTest.findAverage(new int []{}));

        assertEquals("No value present", exception.getMessage());
    }
}
