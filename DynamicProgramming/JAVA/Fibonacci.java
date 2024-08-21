package DSA.DynamicProgramming.JAVA;

// Basic Dynamic Programming using fibonacci series


public class Fibonacci {
    public static int Memoization(int num, int[] cache){
        if(num == 0 || num == 1 ){
            return num;
        }
        if(cache[num] != 0){
            return cache[num];
        }
        cache[num] = Memoization(num-1, cache) + Memoization(num - 2, cache);

    return cache[num];
    }
    public static int Tabulation(int num){
        int[] Dp = new int[num+1];
        Dp[0] = 0;
        Dp[1] = 1;

        for(int n = 2; n < num + 1; n++){
            Dp[n] = Dp[n-1] + Dp[n - 2];
        }

    return Dp[num];
    }

    public static void main(String[] args) {
        int num = 5;
        int[] cache = new int[num+1];
        System.out.println("Memoization : " +Memoization(num, cache));
        System.out.println("Tabulation : "+Tabulation(num));
    }
}
