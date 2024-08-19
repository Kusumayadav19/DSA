//  189. Rotate Array -Topics (Array,Math,Two Pointers) - Level (Medium)

public class RotateArray{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        reverse(nums, 0, n - 1);   // reverse the entire array
        reverse(nums, 0, k - 1);   // reverse the first k elements
        reverse(nums, k, n - 1);   // reverse the remaining n-k elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

        for(int idx = 0; idx < nums.length; idx++){
            System.out.print(nums[idx] + " ");
        }
        
    }
}