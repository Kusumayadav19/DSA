// 53. Maximum Subarray -Topic(array) - Level(Medium)

public class MaxSubarray{
    public static int kadaneAlgo(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int val = 0; val < nums.length; val++){
            currSum += nums[val];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(kadaneAlgo(nums));
    }
}