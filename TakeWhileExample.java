import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 1, 10, 12);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
