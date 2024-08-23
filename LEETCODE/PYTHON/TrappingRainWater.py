
def TrappedWater(height):
    n = len(height)
    left = [0] * len(height)
    right = [0] * len(height)

    left[0] = height[0]
    right[n-1] = height[n-1]

    for idx in range(n):
        left[idx] = max(height[idx], left[idx -1])

    for idx in range(n-2,0):
        right[idx] = max(height[idx],right[idx+1])

    trapwater = 0
    for idx in range(n):
        width = min(left[idx], right[idx])
        trapwater += width - height[idx]

    return trapwater

height = [4,2,0,3,2,5]
print(TrappedWater(height))