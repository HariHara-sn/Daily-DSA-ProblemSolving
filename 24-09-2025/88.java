package Day10;

public class 88 {
    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int l = 0;
        int len = m+n;
        int j=0;

        for(int i=0;i<n;i++){
            nums1[m++]=nums2[i];
        }
        Arrays.sort(nums1);
        // int[] num = new int[len];
        
        // while(i<m&&j<n){
        //     if(nums1[i]<nums2[j]){
        //         num[l++] = nums1[i++];
        //     }
        //     else{
        //         num[l++] = nums2[j++];
        //     }
        // }
        // while(i < m) num[l++] = nums1[i++];
        // while(j < n) num[l++] = nums2[j++]; 

        // for(int k=0;k<len;k++){
        //     nums1[k]=num[k];
        // }

    }
}
}
