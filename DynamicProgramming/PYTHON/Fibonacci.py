# Basic Dynamic Programming using Fibonacci Series

def FibMemoization(num,cache): # Memoization
    if(num == 0 or num == 1):
        return num
    if(cache[num] != 0):
        return cache[num]

    cache[num] = FibMemoization(num - 1,cache) + FibMemoization(num -2 , cache)
    return cache[num]
 
def FibTabulation(num): # Tabulation
    Dp = [0] * (num + 1)
    Dp[0] = 0
    Dp[1] = 1
    for idx in range(2,num+ 1):
        Dp[idx] = Dp[idx-1] + Dp[idx - 2]

    return Dp[num]


num = 5
cache =[0] * (num + 1) 
print("Memoization : ",FibMemoization(num,cache))
print("Tabulation : ",FibTabulation(num))
