
import java.util.*;

public class ThreeSum{
    public static List<List<Integer>> ThreeSumFunc(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total > 0){
                    j++;
                }else if(total < 0){
                    k--;
                }else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = ThreeSumFunc(nums);
        System.out.println(result);
    }
    
}