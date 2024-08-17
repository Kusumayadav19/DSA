def subsequence(idx, nums, sublist):
    if idx == len(nums):
        print(sublist)
        return
    
    # Include the current element
    subsequence(idx + 1, nums, sublist + [nums[idx]])

    # Exclude the current element
    subsequence(idx + 1, nums, sublist)


nums = [1, 2, 3]
# Initial call with an empty sublist
subsequence(0, nums, [])
