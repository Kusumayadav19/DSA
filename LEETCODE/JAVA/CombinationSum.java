//  39. Combination Sum - Level(Medium) - Topic(BackingTracking)

import java.util.*;

public class CombinationSum {
    public static void CombinationSumList(int idx, int[] nums, int target,List<List<Integer>> resultList,List<Integer> subList){
        if(idx >= nums.length){
            if(target == 0){
                resultList.add(new ArrayList<>(subList));
            }
        return;
        }
        if(nums[idx] <= target){
            subList.add(nums[idx]);
            CombinationSumList(idx, nums, target - nums[idx], resultList, subList);
            subList.remove(subList.size() - 1);
        }
        CombinationSumList(idx+1, nums, target, resultList, subList);
    }  
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> resultList = new ArrayList<>(); 
        CombinationSumList(0,nums,target,resultList, new ArrayList<>()); 
        System.out.println(resultList);
    }
}
