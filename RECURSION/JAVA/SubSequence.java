package DSA.RECURSION.JAVA;
// Print all subsequence of array using recursion
import java.util.*;

public class SubSequence{
    public static void AllSubSequence(int idx, int[] nums, List<Integer> subList){
        if(idx >= nums.length){
            System.out.println(subList);
            return;
        }
        subList.add(nums[idx]);
        AllSubSequence(idx +1 , nums, new ArrayList<>(subList));

        subList.remove(subList.size()-1);
        AllSubSequence(idx+1, nums, subList);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        AllSubSequence(0, nums, new ArrayList<>());        
    }
}