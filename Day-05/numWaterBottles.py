class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        count = numBottles
        while (numBottles)>=numExchange:
            filledBottles=int(numBottles/numExchange)
            remainingBottles = int(numBottles%numExchange)
            numBottles= filledBottles+remainingBottles
            count+=filledBottles
        return count

        
