#  392. Is Subsequence - Level(Easy) - Topic(String,Two Pointer, Dynamic Programming)

def IsSubsequence(s,t):
    left, right = 0, 0

    while left < len(s) and right < len(t):
        if s[left] == t[right]:
            left += 1
        right += 1
    
    return left == len(s)

s = "abc"
t = "abghce"
print(IsSubsequence(s,t))