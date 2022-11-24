package streamapi.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 8));
        System.out.println(numbers);

        // Lọc và lấy ra các giá trị > 2 trong mảng numbers
        List<Integer> ds = numbers.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(ds);

        List<String> arr = new ArrayList<>(Arrays.asList("2", "3", "4", "6", "8"));
        System.out.println(arr);

        // Lọc và lấy ra các giá trị != 3 trong mảng arr
        List<String> ds1 = arr.stream().filter(line -> !"3".equals(line)).collect(Collectors.toList());
        System.out.println(ds1);
    }
}
