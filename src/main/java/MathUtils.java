import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathUtils {
    //1. Проверка чётности числа
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //4. Поиск максимального числа в массиве
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    //5. Проверка, является ли год високосным
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //7. Факториал числа
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    //8. Поиск второго максимального числа в массиве
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    //11. Фильтрация списка чисел (оставить только чётные)
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    //14. Нахождение среднего значения массива чисел
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }

    //18. Нахождение наибольшего общего делителя (НОД)
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //20. Проверка, содержит ли массив дубликаты
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
