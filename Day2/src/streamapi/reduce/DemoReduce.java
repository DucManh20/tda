package streamapi.reduce;

import java.util.Arrays;
import java.util.List;


public class DemoReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> arr = Arrays.asList("a", "b", "c", "d");
        List<Person> personList = Arrays.asList(new Person("A", 20), new Person("B", 23));
        // reduce tính tổng các phần tử trong mảng
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
        // reduce cộng chuỗi
        String result1 = arr.stream().reduce("", (a, b) -> a + b);
        System.out.println(result1);

    }
}
