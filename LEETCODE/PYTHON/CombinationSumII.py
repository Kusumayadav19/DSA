# 40. Combination Sum II - level(Medium) - Topic(backtracking)

def BackTracking(idx, nums, target, resultlist, sublist):
    if target == 0:
        resultlist.append(list(sublist))
        return
    
    for i in range(idx, len(nums)):
        # Skip duplicates
        if i > idx and nums[i] == nums[i - 1]: 
            continue
        if( nums[i] > target):
            break
        
        sublist.append(nums[i])
        BackTracking(i + 1, nums, target - nums[i], resultlist, sublist)
        sublist.pop()

nums = [10,1,2,7,6,1,5]
target = 8
result = []
nums.sort()  # Sort to handle duplicates
BackTracking(0, nums, target, result, [])
print(result)
