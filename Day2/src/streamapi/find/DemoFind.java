package streamapi.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoFind {
    public static void main(String[] args) {
        // findAny() : lấy ra số lượng phần tử thỏa mãn
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result = list
                .stream().parallel()
                .filter(num -> num < 4).findAny();
        System.out.println(result);
        // findFirst() : lấy ra phần tử đầu của list
        List<String> list1 = Arrays.asList("A", "B", "C", "D");
        Optional<String> result1 = list1.stream().findFirst();
        System.out.println(result);
    }
}
