# Basic Dynamic Programming using Fibonacci Series

def FibonacciDP(num,cache):
    if(num == 0 or num == 1):
        return num
    if(cache[num] != 0):
        return cache[num]

    cache[num] = FibonacciDP(num - 1,cache) + FibonacciDP(num -2 , cache)
    return cache[num]

num = 5
cache =[0] * (num + 1) 
print(FibonacciDP(num,cache))
