#  print all subsequence sum = k

def SubSequenceSum(idx,nums,sublist, sumo, k):
    if idx == len(nums):
        if sumo == k:
            print(sublist, ": " , sumo)
        return

    SubSequenceSum(idx+1,nums,sublist + [nums[idx]],sumo + nums[idx], k)

    SubSequenceSum(idx+1,nums,sublist,sumo,k)

nums = [1,2,1]
SubSequenceSum(0,nums,[],0,2)