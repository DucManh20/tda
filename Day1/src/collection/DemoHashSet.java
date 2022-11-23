package collection;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {
        // tạo HashSet
        HashSet<String> setA = new HashSet<String>();
        HashSet<String> setB = new HashSet<String>();
        // thêm phần tử vào setA
        setA.add("A");
        setA.add("B");
        setA.add("C");

        setB.add("1");

        setA.size(); // số phần tử của setA
        setA.toArray();

        setA.remove("A"); // xóa phần tử A khỏi setA
        setA.remove(1); // xóa phần tử có index = 1 trong setA

        setA.addAll(setB); // thêm toàn bộ phần tử trong setB vào setA
        setA.removeAll(setB); // xóa toàn bộ phần tử của setB trong setA

        setA.isEmpty(); // kiểm tra setA có rỗng hay k

        // in ra các phần tử trong setA
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
