class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        number=" "
        for i in num:
            number+=str(i)
        sum =int(number)+k
        
        new_num = [int(j) for j in str(sum)]
        return (new_num)
