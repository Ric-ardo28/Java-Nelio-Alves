package lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(str1.toArray()));
    }
}
