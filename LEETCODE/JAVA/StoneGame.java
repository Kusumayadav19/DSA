// 877. Stone Game - Topics (Array,Math,Dynamic Programming,Game Theory) - Level - (Medium)

public class StoneGame{
    public static boolean MaximumCost(int[] piles){
        int left = 0, right = piles.length - 1;
        int alice = 0, bob = 0;

        while(left <= right){
            if(piles[left] >= piles[right]){
                alice += piles[left];
                bob += piles[right];
            }else{
                alice += piles[right];
                bob += piles[left];
            }
            left++;
            right--;
        }
        return alice > bob;
    }
    public static void main(String[] args) {
        int[] piles = {5,3,4,5};
        System.out.println(MaximumCost(piles));

        
    }
}