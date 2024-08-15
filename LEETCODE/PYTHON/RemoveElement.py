# 27. Remove Element (EASY) - Topic - Array, TwoPointers

# Example 1:
# Input: nums = [3,2,2,3], val = 3
# Output: 2, nums = [2,2,_,_]
# Explanation: Your function should return k = 2, with the first two elements of nums being 2.
# It does not matter what you leave beyond the returned k (hence they are underscores).

def RemoveElement(nums,val):
    left ,right = 0 , 0

    while left < len(nums):
        if nums[left] != val:
            nums[right] = nums[left]
            right += 1
        left += 1

    return right

nums = [0,1,2,2,3,0,4,2]
val = 2
print("length of nums after Remove element:", RemoveElement(nums,val))