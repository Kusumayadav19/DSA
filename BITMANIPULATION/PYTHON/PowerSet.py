#  Print all Subsequence using Bit Manipulation

def  PowerSetOfBitManipulation(nums):
    resultList = []
    subsequence = 1 << len(nums)
    
    for num in range(subsequence):
        subList = []
        for idx in range(len(nums)):
            if (num & (1 << idx)) != 0:
                subList.append(nums[idx])
        resultList.append(subList)
    return resultList

nums = [1,2,3,4]
Powerset = PowerSetOfBitManipulation(nums)
print(Powerset)

