
import java.util.*;

public class CombinationSumII {
    public static void BackTracking(int idx, int[] nums,int target, List<List<Integer>> resultList, List<Integer> subList){
        if(target == 0){
            resultList.add(new ArrayList<>(subList));
            return;
        }
        for(int start = idx; start < nums.length; start++){
            if(start > idx && nums[start] == nums[start-1]) continue;
            if( nums[start] > target) break;
    
            subList.add(nums[start]);
            BackTracking(start + 1, nums, target - nums[start], resultList, subList);       
            subList.remove(subList.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        BackTracking(0, nums, target, result, new ArrayList<>());
        System.out.println(result);
    }
}
