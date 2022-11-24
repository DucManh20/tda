package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class DemoLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,2,4,5, 3, 2, 2);
        System.out.println(numbers);

        // truyền biểu thức lambda vào method
        numbers.forEach(a -> {
            System.out.println(a);
        });
//        Consumer<Integer> ds = n -> System.out.println(n);
//        numbers.forEach(ds);

        Map<String, Person> map = new HashMap<String, Person>();
        map.put("1", new Person("A", 19));
        map.put("2", new Person("B", 9));
        map.put("3", new Person("C", 16));

        // dùng lambda
        map.forEach((k, v) -> System.out.println(k +" "+v.getName() +" "+ v.getAge()));

        // không dùng lambda
        for(Map.Entry<String, Person> entry: map.entrySet() ){
            System.out.println(entry.getKey() +" "+ entry.getValue().getName());
        }

        List<Person> list = Arrays.asList( new Person("D", 19),  new Person("B", 18));
        System.out.println(list);

        // sắp xếp list theo tên
        list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(list);
    }
}
