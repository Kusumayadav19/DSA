# 70. Climbing Stairs - Level -(Easy) - Topic -(Array, Dynamic Programming)

# Approach 1: Memoization 
def memoization(num, cache):
    if num == 0 or num == 1:
        return 1
    
    if cache[num] != 0:
        return cache[num]
    
    cache[num] = memoization(num - 1, cache) + memoization(num - 2, cache)

    return cache[num]

# Approach 2: Tabulation
def tabulation(num):
    cache = [0] * (num + 1)

    cache[0] = 1
    cache[1] = 1

    for idx in range(2, num + 1):
        cache[idx] = cache[idx - 1] + cache[idx - 2]

    return cache[num]


num = 5
cache = [0] * (num + 1)
print("DP Memoization:", memoization(num, cache))
print("DP Tabulation:", tabulation(num))
