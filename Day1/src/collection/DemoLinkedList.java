package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
    public static void main(String[] args) {
        //Tạo 2 linkedList
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("A"); // thêm một phần tử vào list
        cars.addFirst("B"); // thêm phần tử vào cuối list
        cars.addLast("C"); // thêm phần tử vào cuối list - giống với add()
        cars.get(2); // lấy ra phần tử trong danh sách theo index
        cars.size(); // kích thước list
        cars.push("D"); // thêm phần tử vào đầu list
        cars.pop(); // lấy ra phần tử ở đầu list
        cars.set(2, "E"); // cập nhật giá trị cho phần tử có index = 2
        cars.contains("A"); // kiểm tra phần tử có trong list hay không, trả về giá trị boolean
        cars.indexOf("A"); // kiểm tra phần tử tồn tại trong list hay k, trả về index

        cars.addAll(list); // thêm phần tử của list vào cars
        cars.removeAll(list); // xóa toàn bộ phần tử của list trong cars

        cars.removeFirst(); // xóa phần tử đầu list
        cars.remove(); // xóa phần tử đầu tiên của list
        cars.remove(2); // remove theo index
        cars.remove("A"); // remove theo giá trị
        cars.clear();// xóa tất cả phần tử trong list

        // show list
        for (String a : cars) {
            System.out.println(a.toString());
        }
        ListIterator<String> iterator = cars.listIterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
        System.out.println(list);
        System.out.println(cars);
    }
}
