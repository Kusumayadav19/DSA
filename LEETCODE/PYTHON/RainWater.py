def TrappingRainWater(height):
    n = len(height)
    
    if n == 0:
        return 0
    
    left = [0] * n
    right = [0] * n

    left[0] = height[0]
    for i in range(1, n):
        left[i] = max(height[i], left[i-1])

    right[n-1] = height[n-1]
    for j in range(n-2, -1, -1):
        right[j] = max(height[j], right[j+1])

    trapwater = 0
    for i in range(n):
        width = min(left[i], right[i])
        trapwater += width - height[i]

    return trapwater

height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
print(TrappingRainWater(height))
