//  42. Trapping Rain Water 
// Topic - (Array,Two Pointers,Dynamic Programming,Stack,Monotonic Stack) || Level - (HARD)

public class RainWater{
    public static int TrappingRainWater(int[] height){
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        right[n-1] = height[n-1];
        for(int j = n -2; j >= 0; j--){
            right[j] = Math.max(height[j],right[j+1]);
        }

        int trapwater = 0;
        for(int i = 0; i < n; i++){
            int width = Math.min(left[i],right[i]);
            trapwater += width - height[i];
        }
    return trapwater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingRainWater(height));

    }
}