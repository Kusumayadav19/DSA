# 53. Maximum Subarray -Topic(array) - Level(Medium)

def MaxSubArray(nums):
    currSum = 0
    maxSum = 0

    for idx in range(len(nums)):
        currSum += nums[idx]

        if(maxSum < currSum):
            maxSum = currSum

        if(currSum < 0):
            currSum = 0
    
    return maxSum

nums = [-2,1,-3,4,-1,2,1,-5,4]
print(MaxSubArray(nums))