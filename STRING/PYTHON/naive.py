# Naive String Matching Algorithm - A brute force Approach

def naiveStringMatchingAlgo(text,pattern):
    result = []
    n = len(text)
    m = len(pattern)

    for i in range(n - m + 1):
        j = 0
        while j < m and pattern[j] == text[i+j]:
            j += 1

        if j == m:
            result.append(i)

    return result if result else -1

text = 'abcabaabcabaa'
pattern = 'abaa'
print(naiveStringMatchingAlgo(text,pattern))
