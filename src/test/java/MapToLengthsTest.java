import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest extends StringUtilsTest {
    //Тесты:
    //[ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
    //Пустой список

    @Test
    public void shouldReturnListWithLengthStrings() {
        List<Integer> actualResult = stringUtilsTest.mapToLengths(List.of("Java", "C++", "Go"));

        assertEquals(List.of(4, 3, 2), actualResult);
    }

    @Test
    public void shouldReturnEmptyListFromEmptyList() {
        List<Integer> actualResult = stringUtilsTest.mapToLengths(List.of());

        assertEquals(List.of(), actualResult);
    }
}
