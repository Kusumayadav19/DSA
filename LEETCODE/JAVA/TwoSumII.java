// 167. Two Sum II - Input Array Is Sorted - Level(Medium) - Topic - (Array , Two Pointers, Binary Search)

// import java.util.*;

public class TwoSumII{
    public static int[] TwoSum(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left < right){
            int total = nums[left] + nums[right] ;

            if(total == target){
                return new int[]{left+1, right + 1};

            }else if(total > target){
                right--;

            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,11,15};
        int target = 9;
        int[] result = TwoSum(nums,target);  
        System.out.println(Arrays.toString(result)); 
    }
}