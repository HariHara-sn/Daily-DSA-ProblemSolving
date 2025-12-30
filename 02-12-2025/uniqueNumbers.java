import java.util.*;

public class uniqueNumbers {
    public static void arrayList(int[] arr) {
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int num : arr) {
	        if(!list.contains(num)) {
	            list.add(num);
	        }
	    } 
	    System.out.println(list);
    }
    public static void usingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
    public static void myApproach(int[] arr) {
	    int[] freq = new int[9];
	    for(int num : arr) {
	        freq[num]++;
	    }
	   for(int i = 0; i < freq.length; i++) {
	       if(freq[i] > 0) {
	           System.out.print(i + " ");
	       }
	   }
	    
	}
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 7, 5};
        arrayList(arr);
        usingHashSet(arr);
        myApproach(arr); //freq array
    }
}
