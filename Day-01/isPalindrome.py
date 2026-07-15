class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if(x<0):
            return False
        else:
            x_str = str(x)
            if int(x_str[::-1]) ==x:
                return True
            else:
                return False
        
