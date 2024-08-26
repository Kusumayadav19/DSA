# Reverse Words in a String - Level(medium) Topic (Two Pointers,String)

def ReverseWords(s):
    listWords = s.split()[::-1]
    return ' '.join(listWords)


s = "the sky is blue"
print(ReverseWords(s))