import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest extends MathUtilsTest{
    //Тесты:
    //24, 36 → 12
    //101, 103 → 1
    //0, 10 → 10

    @Test
    public void shouldReturnGcdWhenBothNumbersHaveSomeDivisor() {
        int actualResult = mathUtilsTest.gcd(24, 36);

        assertEquals(12, actualResult);
    }

    @Test
    public void shouldReturnGcdWhenBothNumbersHaveOneDivisor() {
        int actualResult = mathUtilsTest.gcd(101, 103);

        assertEquals(1, actualResult);
    }

    @Test
    public void shouldReturnGcdWhenOneOfNumbersIsZero() {
        int actualResult = mathUtilsTest.gcd(0, 10);

        assertEquals(10, actualResult);
    }
}
