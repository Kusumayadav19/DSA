#  14. Longest Common Prefix
# Write a function to find the longest common prefix string amongst an array of strings.
# If there is no common prefix, return an empty string "".
# Example 1:
# Input: strs = ["flower","flow","flight"]
# Output: "fl"

def longestCommonPrefix(strs):
    if not strs:
        return ""

    commonPrefix = []

    for i in range(len(strs[0])):
        letter = strs[0][i]

        for j in range(1,len(strs)):
            if(i >= len(strs[j]) or strs[j][i] != letter):
                return "".join(commonPrefix)

        commonPrefix.append(letter)

    return "".join(commonPrefix)

strs = ["flow","flight","flower"]
print(longestCommonPrefix(strs))