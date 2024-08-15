#  88. Merge Sorted Array (Easy)  Topics : Arrays, TwoPointers, Sorting

# Example 1:
# Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
# Output: [1,2,2,3,5,6]
# Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
# The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

def MergaArray(nums1,m,nums2,n):
    if n == 0: return
    endIdx = len(nums1) - 1

    while n > 0 and m > 0:
        if nums2[n-1] >= nums1[m-1]:
            nums1[endIdx] = nums2[n-1]
            n -= 1
        else:
            nums1[endIdx] = nums1[m-1]
            m -= 1
        endIdx -= 1

    while n > 0:
        nums1[endIdx] = nums2[n-1]
        n -= 1
        endIdx -= 1

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
m = 3
n = 3
MergaArray(nums1,m,nums2,n)
print(nums1)