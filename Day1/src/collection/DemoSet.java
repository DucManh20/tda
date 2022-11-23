package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        // tạo set
        Set<String> setA = new TreeSet<>(); // TreeSet: có sắp xếp phần tử theo thứ tự
        // HashSet: không sắp xếp

        // thêm phần tử vào setA
        setA.add("A");
        setA.add("D");
        setA.add("B");
        setA.size(); // số phần tử của size
        setA.clear(); // xóa toàn bộ phần tử trong setA
        setA.remove("A"); //xóa theo giá trị
        setA.isEmpty(); // check setA rỗng hay không

        System.out.println(setA);
    }
}
