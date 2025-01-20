import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>(List.of("Alice", "Bob", "Carol", "David","Allan"));

        List <Integer> nbr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));


        // Exercice 1

        List<String> filteredStrings =
                        strings.stream()
                        .filter(string -> string.toLowerCase().startsWith("a") || string.toLowerCase().startsWith("b"))
                        .toList();

        filteredStrings.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------");


        // Exercice 2


        List<Integer> carre =
                        nbr.stream()
                        .map(x -> x*x)
                        .toList();

        carre.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------");



        // Exercice 3
        Integer sum = nbr.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("--------------------------------------------------------------------------");


        // Exercice 4
        List<String> MajList = strings.stream()
                .map(String::toUpperCase)
                .toList();
        MajList.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");
        // Exercice 5

        List<String> InverseListe =
                strings.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        InverseListe.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");


        // Exercice 6
        List<String> suppDouble =
                strings.stream()
                .distinct().toList();

        suppDouble.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");

        // Exercice 7

        System.out.println(nbr.stream()
                .max(Comparator.naturalOrder()));


        System.out.println("--------------------------------------------------------------------------");
        // Exercice 8
        nbr.stream()
                .filter(x -> x>0)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");
        // Exercice 9
        nbr.stream()
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");
        // Exercice 10

        List<Object> con =
                Stream.concat(
                strings.stream(),
                nbr.stream()
        ).collect(Collectors.toList());

        con.forEach(System.out::println);



    }
}