
// 70. Climbing Stairs - Level -(Easy) - Topic -(Array, Dynamic Programming)

public class ClimbStair {
    // Approach 1 : Momization 
    public static int Momization(int num, int[] cache){
        if(num == 0 )return 1;
        if(num < 0) return 0;

        if(cache[num] != 0){
            return cache[num];
        }
        
        cache[num] = Momization(num - 1, cache) + Momization(num - 2, cache);

    return cache[num];
    }

    // Approach 2 : Tabulation
    public static int Tabulation(int num){
        int[] cache = new int[num+1];

        cache[0] = 1;
        cache[1] = 1;

        for(int idx = 2; idx < num + 1; idx++){
            cache[idx] = cache[idx - 1] + cache[idx -2];
        }

    return cache[num];
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("DP Momization : "+ Momization(num, new int[num+1]));
        System.out.println("DP Tabulation : "+ Tabulation(num));
    }
}
