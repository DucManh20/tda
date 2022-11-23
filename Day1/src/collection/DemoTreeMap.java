package collection;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        // khai báo map1 có 2 giá trị key, value là kiểu String
        TreeMap<String, String> map1 = new TreeMap<String, String>(); // TreeMap: sắp xếp theo key


        // thêm các phần tử vào map1
        map1.put("A", "Manh");
        map1.put("B", "Mh");
        map1.put("D", "Mh");
        map1.put("C", "Ma");

        map1.remove("B"); // xóa phần tử theo key
       // map1.clear(); // xóa toàn bộ map1

        // in ra các phần tử trong map( key và value)
        System.out.println(map1);

        Set<String> keySet = map1.keySet();
        for(String key: keySet){
            System.out.println(key+"   "+map1.get(key));
        }

        // in ra map1 dùng entry
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
