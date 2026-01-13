// https://youtube.com/shorts/tutzYsVWwbc?si=aVxVH-1LRSSLLfrp - YouTube
public class ContainsMostWater {
    public static void method1(int[] arr) {
        int maxArea = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int min = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = width * min;
                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }
        System.err.println(maxArea);
    }
    public static void method2(int[] arr) {
        int maxArea = 0;
        int  i = 0;
        int j = arr.length - 1;
        while (i < j) {
                int min = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = width * min;
                maxArea = Math.max(area, maxArea);
                if(arr[i] < arr[j]) {
                    i++;
                } else {
                    j--;
            }
        }
        System.err.println(maxArea);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        method2(arr); // O(N) - same easy to understand - twopointers
        // method1(arr); // O(N^2) - but easy to understand
        
    }
}
