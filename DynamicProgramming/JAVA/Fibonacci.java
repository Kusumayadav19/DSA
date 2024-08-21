package DSA.DynamicProgramming.JAVA;

// Basic Dynamic Programming using fibonacci series


public class Fibonacci {
    public static int FibonacciDP(int num, int[] cache){
        if(num == 0 || num == 1 ){
            return num;
        }
        if(cache[num] != 0){
            return cache[num];
        }
        cache[num] = FibonacciDP(num-1, cache) + FibonacciDP(num - 2, cache);

    return cache[num];
    }
    public static void main(String[] args) {
        int num = 5;
        int[] cache = new int[num+1];
        System.out.println(FibonacciDP(num, cache));
    }
}
