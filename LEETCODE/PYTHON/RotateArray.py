# 189. Rotate Array -Topics (Array,Math,Two Pointers) - Level (Medium)

def RotateArray(nums,k):
    n = len(nums)
    k = k % n
    nums[:] = nums[-k:] + nums[:-k]

nums = [1,2,3,4,5,6,7]
RotateArray(nums,3)
print(nums)