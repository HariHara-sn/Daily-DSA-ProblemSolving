public class SumofUniqueElements_1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int freq[] = new int[101];
        int sum = 0;
        for(int num : nums) {
            freq[num]++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == 1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
