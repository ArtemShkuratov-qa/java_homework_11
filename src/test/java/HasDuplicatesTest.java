import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest extends MathUtilsTest {
    //Тесты:
    //[1, 2, 3, 4, 5] → false
    //[1, 2, 2, 3] → true
    //Пустой массив → false

    @Test
    public void shouldReturnFalseFromArrayWithoutDuplicates() {
        boolean actualResult = mathUtilsTest.hasDuplicates(new int[]{1, 2, 3, 4, 5});

        assertFalse(actualResult);
    }

    @Test
    public void shouldReturnTrueFromArrayWithDuplicates() {
        boolean actualResult = mathUtilsTest.hasDuplicates(new int[]{1, 2, 2, 3});

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseFromEmptyArray() {
        boolean actualResult = mathUtilsTest.hasDuplicates(new int[]{});

        assertFalse(actualResult);
    }
}
