// 121. Best Time to Buy and Sell Stock - Level(Easy) - Topic(Array, Dynamic Programming)

public class BuySell {
    public static int BestTime(int[] prices){
        int buyCost = prices[0];
        int maxProfit = 0;
        for(int idx = 1; idx < prices.length; idx++){
            if(buyCost < prices[idx]){
                int currProfit = prices[idx] - buyCost;
                maxProfit = Math.max(maxProfit, currProfit);
            }else{
                buyCost = prices[idx];
            }
        }
    return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestTime(prices));
    }
}
