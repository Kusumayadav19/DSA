import java.util.*;
// Print all Subsequence using Bit Manipulation

public class PowerSet{
    public static List<List<Integer>> PowerSetOfBitManipulation(int[] nums){
        // List of List
        List<List<Integer>> resultList = new ArrayList<>();
        // counting total number of subsequence possible  and always its 2^n (n = total no. of elements)
        int subSequence = 1 << nums.length; 

        for(int num = 0; num < subSequence; num++){
            List<Integer> subList = new ArrayList<>();

            for(int idx = 0; idx < nums.length; idx++){
                if((num & (1 << idx)) != 0){
                    subList.add(nums[idx]);
                }
            }

        resultList.add(subList);
        }

    return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> PowerSet = PowerSetOfBitManipulation(nums);
        System.out.println(PowerSet);
    }
}