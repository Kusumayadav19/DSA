
/* 88. Merge Sorted Array (Easy)  Topics : Arrays, TwoPointers, Sorting
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. */

public class MergeArray {
    public static void mergeArray(int[] nums1, int m, int[] nums2, int n){
        if(n == 0) return;
        int endIdx = nums1.length - 1;

        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[endIdx] = nums2[n-1];
                n--;
            }else{
                nums1[endIdx] = nums1[m-1];
                m--;
            }
            endIdx--;
        }

        while(n > 0){
            nums1[endIdx] = nums2[n-1];
            n--;
            endIdx--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0}, nums2 = {2,4,6} ;
        int m = 3, n = 3;
        mergeArray(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}