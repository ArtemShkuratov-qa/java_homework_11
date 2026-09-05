import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends MathUtilsTest{
    //Тесты должны проверять:
    //Чётные и нечётные числа
    //Нулевое значение
    //Отрицательные числа

    @Test
    public void shouldReturnTrueWhenNumberIsEven() {
        boolean actualResult = mathUtilsTest.isEven(4);

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsZero() {
        boolean actualResult = mathUtilsTest.isEven(0);

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNegative() {
        boolean actualResult = mathUtilsTest.isEven(-5);

        assertFalse(actualResult);
    }
}
