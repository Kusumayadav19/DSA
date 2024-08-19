# 746. Min Cost Climbing Stairs - Level(Easy) - Topics -(Array, Dynamic Programming)

def MinCostClimbingStairs(cost):
    n = len(cost)
    oneStep = cost[0]
    twoStep = cost[1]

    if n <= 2: return min(oneStep,twoStep)

    for idx in range(2,n):
        currStep = cost[idx] + min(oneStep,twoStep)
        oneStep = twoStep
        twoStep = currStep

    return min(oneStep,twoStep)

cost = [10,15,20]
print(MinCostClimbingStairs(cost))
