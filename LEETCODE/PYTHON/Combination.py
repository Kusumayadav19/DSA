# 39. Combination Sum - Level(Medium) - Topic(BackingTracking)

def BackTracking(idx, nums, target,resultlist,sublist,):
    if(idx >= len(nums)):
        if(target == 0):
            resultlist.append(list(sublist))
        return
    if(nums[idx] <= target):
        sublist.append(nums[idx])
        BackTracking(idx,nums,target - nums[idx],resultlist,sublist)
        sublist.pop()
    
    BackTracking(idx + 1, nums,target,resultlist,sublist)

nums = [2,3,6,7]
target = 7
result  = []
BackTracking(0,nums,target,result,[])
print(result)