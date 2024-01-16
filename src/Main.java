import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

    // ЗАДАЧА 1

        System.out.println("-----------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        int summa = numbers.stream()
                .reduce(0, (acc, elem) -> acc + elem * elem);
        System.out.println(summa);

        System.out.println("-----------------------------------------------------------------");

    // ЗАДАЧА 2

        ArrayList<String> words = new ArrayList<>();

        words.add("Колонна");
        words.add("Плед");
        words.add("Ваниль");
        words.add("Кот");
        words.add("Мороз");
        words.add("Полено");
        words.add("Колокольчик");

        words.stream()
                .filter(x -> x.length() > 5)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");

    // ЗАДАЧА 3

        ArrayList<Integer> values = new ArrayList<>();

        values.add(125);
        values.add(215);
        values.add(1314);
        values.add(134);
        values.add(522);
        values.add(615);
        values.add(74);

        int maxValue = values.stream()
                .reduce(0,(acc, elem) -> acc > elem ? acc : elem );

        System.out.println(maxValue);

        System.out.println("-----------------------------------------------------------------");

    // ЗАДАЧА 4

        String maxLength = words.stream()
                .reduce("", (acc, elem) -> acc.length() > elem.length() ? acc : elem );

        System.out.println(maxLength);

        System.out.println("-----------------------------------------------------------------");





    }
}
