def RabinKarp(text, pattern):
    d, q = 10, 13  # d is the number base; q is a prime number
    n, m = len(text), len(pattern)
    p, t, h = 0, 0, 1

    # Calculate the value of h = (h * d) % q
    for i in range(m - 1):
        h = (h * d) % q

    # Calculate the hash value of the pattern and the first window of text
    for i in range(m):
        p = (d * p + ord(pattern[i])) % q
        t = (d * t + ord(text[i])) % q

    # Slide the pattern over text one by one
    for i in range(n - m + 1):
        # Check the hash values of the current window of text and pattern
        if p == t:
            # Check for characters one by one
            match = True
            for j in range(m):
                if text[i + j] != pattern[j]:
                    match = False
                    break
            if match:
                print("Pattern found at location:", i)

        # Calculate hash value for the next window of text
        if i < n - m:
            t = (d * (t - ord(text[i]) * h) + ord(text[i + m])) % q

            # Convert negative hash value to positive
            if t < 0:
                t += q

# Example usage
text = "ABCCDDAEFG"
pattern = "CDD"
RabinKarp(text, pattern)
