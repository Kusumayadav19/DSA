package DSA.RECURSION.JAVA;
// print all subsequence sum = k
import java.util.*;

public class SubSequenceSum {
    public static void subsequencesum(int idx, int[] nums, List<Integer> sublist,int sum,int k){
        if(idx == nums.length){
            if(sum == k){
                System.out.print(sublist);
                System.out.println(": " + sum);
            }
            return;
        }
        sublist.add(nums[idx]);
        subsequencesum(idx+1, nums, new ArrayList<>(sublist), sum + nums[idx], k);

        sublist.remove(sublist.size() -1);
        subsequencesum(idx+1, nums, sublist, sum, k);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        subsequencesum(0, nums, new ArrayList<>(), 0, 2);
    }
}

