# Horspool String Matching Algorithm - Heuristic Algorithm Approach


# Shift Table
def shiftTable(pattern):
    m = len(pattern)
    table = [m] * 26

    for idx in range(m-2):
        table[ord(pattern[idx]) - ord('A')] = m - 1 - idx

    return table

# Horspool Algorithm
def Horspool(text,pattern,table):
    n = len(text)
    m = len(pattern)
    i = m - 1

    while i <= n - 1:
        k = 0
        while k <= m and pattern[m-1-k] == text[i - k]:
            k += 1

        if k == m:
            return i -m + 1
        else:
            i = i + table[ord(text[i]) - ord('A')]

    return -1

text = 'GTACTATGTA'
pattern = 'ATGTA'
table = shiftTable(pattern)
print("Shift Table:",table)
print()
print("Pattern found at index :",Horspool(text,pattern,table))