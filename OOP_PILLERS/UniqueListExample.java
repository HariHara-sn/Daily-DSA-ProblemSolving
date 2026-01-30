import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 10, 20, 30, 40, 50, 10, 30, 40, 50));
        

        List<Integer> unique = removeDuplicatesLinkedHashSet(list);

        System.out.println(unique); 
    }

    static List<Integer> removeDuplicatesLinkedHashSet(List<Integer> list) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>(list);

        return new ArrayList<>(res); // this main order in (sorted)
    }
    static List<Integer> removeDuplicatesHashSet(List<Integer> list) {
        HashSet<Integer> res = new HashSet<>(list);

        return new ArrayList<>(res); // does not maintain order
    }

    static List<Integer> manualRemoveDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer num : list) {
            if(!uniqueList.contains(num)) {
                uniqueList.add(num);
            }

        }
        return uniqueList;
    }
}
