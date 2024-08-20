# 877. Stone Game - Topics (Array,Math,Dynamic Programming,Game Theory) - Level - (Medium)

def StoneGameOne(piles):
    left, right = 0, len(piles) - 1
    alice, bob = 0, 0
    while left <= right:
        if piles[left] >= piles[right]:
            alice += piles[left]
            bob += piles[right]
        else:
            alice += piles[right]
            bob += piles[left]
        left += 1
        right -= 1
    return alice > bob

piles = [5,3,4,5]
print(StoneGameOne(piles))