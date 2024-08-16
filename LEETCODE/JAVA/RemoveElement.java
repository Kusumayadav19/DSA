

// 27. Remove Element (EASY) - Topic - Array, TwoPointers
/* Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores). */

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int left  = 0, right = 0;
        while(left < nums.length){
            if(nums[left] != val){
                nums[right] = nums[left];
                right++;
            }
            left++;
        }
    return right;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println("Length of nums after of Remove Element : " + removeElement(nums, val));
    }
}
