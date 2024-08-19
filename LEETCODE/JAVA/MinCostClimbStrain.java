// 746. Min Cost Climbing Stairs - Level(Easy) - Topics -(Array, Dynamic Programming)

public class MinCostClimbStrain{
    public static int MiniCost(int[] cost){
        int n = cost.length;
        int oneStep = cost[0];
        int twoStep = cost[1];

        if(n <= 2) return Math.min(oneStep,twoStep);

        for(int idx = 2; idx < cost.length; idx++){
            int currStep = cost[idx] + Math.min(oneStep,twoStep);
            oneStep = twoStep;
            twoStep = currStep;
        }
    return Math.min(oneStep,twoStep);
    }
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(MiniCost(cost));
    }
}