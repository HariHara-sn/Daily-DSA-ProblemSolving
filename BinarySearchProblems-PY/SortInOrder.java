import java.util.*;

public class SortInOrder {
    public static List<Integer> insertInOrder(List<Integer> arr, int num) {
        for (int i = 0; i < arr.size(); i++) {
            if (num < arr.get(i)) {
                arr.add(i, num);
                return arr;
            }
        }
        arr.add(num); // if it's larger than all elements
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3));
        System.out.println(insertInOrder(arr, 2));  // [1, 2, 3]
    }
}
