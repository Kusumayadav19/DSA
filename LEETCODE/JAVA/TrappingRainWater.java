// 42. Trapping Rain Water - Level(Hard) - Topic(Array,Two Pointers,Dynamic Programming,Stack,Monotonic Stack)

public class TrappingRainWater{
    public static int TrappedWater(int[] height){
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for(int idx = 1 ; idx < n; idx++){
            left[idx] = Math.max(height[idx], left[idx - 1]);
        }

        right[n-1] = height[n-1];
        for(int idx = n - 2; idx >= 0; idx--){
            right[idx] = Math.max(height[idx], right[idx + 1]);
        }

        int trapwater = 0;
        for(int idx = 0; idx < n; idx++){
            int width = Math.min(left[idx], right[idx]);
            trapwater += width - height[idx];
        }
    return trapwater;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(TrappedWater(height));
    }
}

