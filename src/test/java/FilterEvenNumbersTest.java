import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest extends MathUtilsTest{
    //Тесты:
    //Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
    //Список без чётных чисел
    //Пустой список

    @Test
    public void returnListWithEvenNumbersFromValidList() {
        List<Integer> actualResult = mathUtilsTest.filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6));

        assertEquals(List.of(2, 4, 6), actualResult);
    }

    @Test
    public void returnEmptyListFromListWithoutEvenNumbers() {
        List<Integer> actualResult = mathUtilsTest.filterEvenNumbers(List.of(1, 3, 5));

        assertEquals(List.of(), actualResult);
    }

    @Test
    public void returnEmptyListFromEmptyList() {
        List<Integer> actualResult = mathUtilsTest.filterEvenNumbers(List.of());

        assertEquals(List.of(), actualResult);
    }
}
