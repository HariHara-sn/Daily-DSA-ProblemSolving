import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoIntervals {
    public static void main(String[] args) {
         int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] intervals = {{4,7},{1,4}};
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> out = new ArrayList<>();
        for (int[] interval : intervals) {
            
            if (out.isEmpty() || out.get(out.size() - 1)[1] < interval[0]) {
                out.add(interval);
            } else {
                out.get(out.size() - 1)[1] = Math.max(out.get(out.size() - 1)[1], interval[1]);
            }
        }

        for (int[] arr : out) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
