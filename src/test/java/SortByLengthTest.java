import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest extends StringUtilsTest{
    //Тесты:
    //[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
    //Одинаковые длины ([ "aa", "bb", "cc" ])
    //Пустой список

    @Test
    public void shouldReturnSortedList() {
        List<String> actualResult = stringUtilsTest.sortByLength(List.of("Java", "C", "Python"));

        assertEquals(List.of("C", "Java", "Python"), actualResult);
    }

    @Test
    public void shouldMaintainOrderWhenStringsHaveSameLength() {
        List<String> actualResult = stringUtilsTest.sortByLength(List.of("aa", "bb", "cc"));

        assertEquals(List.of("aa", "bb", "cc"), actualResult);
    }

    @Test
    public void shouldReturnEmptyListForEmptyList() {
        List<String> actualResult = stringUtilsTest.sortByLength(List.of());

        assertEquals(List.of(), actualResult);
    }
}
