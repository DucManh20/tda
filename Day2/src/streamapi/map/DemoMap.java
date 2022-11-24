package streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMap {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(3,2,4,5, 3, 2, 2);
        System.out.println(numbers);

        // lấy ra các phần tử khác nhau trong danh sách
        List<Integer> ds = numbers.stream().map(i -> i).distinct().collect(Collectors.toList());
        System.out.println(ds);

    }
}
