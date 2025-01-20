import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> paire= numbers.stream().filter(number -> number % 2 == 0).toList();
        paire.forEach(System.out::println);

        List<String> words = Arrays.asList("banana", "apple", "cherry", "blueberry");

        List<String> result = words.stream().max(Comparator.comparing(word -> word.length())).toList();
        result.forEach(System.out::println);

        int [] tab;





    }
}