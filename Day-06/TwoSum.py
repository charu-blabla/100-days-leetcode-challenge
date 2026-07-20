class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash ={}
        for i, num in enumerate(nums):
            rest = target-num
            if rest in hash:
                return (hash[rest],i)
            hash[num]=i
        
        
