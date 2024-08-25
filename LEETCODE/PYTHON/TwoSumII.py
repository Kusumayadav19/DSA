# 167. Two Sum II - Input Array Is Sorted - Level(Medium) - Topic - (Array , Two Pointers, Binary Search)

def TwoSumII(nums, target):
    left = 0
    right = len(nums) - 1

    while left < right:
        if nums[left] + nums[right] == target:
            return [left + 1, right + 1]
        elif nums[left] + nums[right] > target:
            right -= 1
        else:
            left += 1

nums = [2,7,11,15]
print(TwoSumII(nums,9))