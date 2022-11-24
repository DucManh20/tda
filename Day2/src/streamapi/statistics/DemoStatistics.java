package streamapi.statistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class DemoStatistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,2,4,5, 3, 2, 2);
        // các class statistics: hỗ trợ xử lý thống kê: lấy ra min, max, sum, avg...
        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println(stats.getMax());
        System.out.println(stats.getMin());

        // in ra count, sum, min, max, average
        System.out.println(stats.toString());
    }
}
