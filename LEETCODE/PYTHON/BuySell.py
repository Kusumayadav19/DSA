# 121. Best Time to Buy and Sell Stock - Level(Easy) - Topic(Array, Dynamic Programming)

def BestTime(prices):
    buyCost = prices[0]
    maxProfit = 0

    for idx in range(len(prices)):
        if buyCost < prices[idx]:
            currProfit = prices[idx] - buyCost
            maxProfit = max(maxProfit, currProfit)
        else:
            buyCost = prices[idx]

    return maxProfit


prices = [7,1,5,3,6,4]
print(BestTime(prices))