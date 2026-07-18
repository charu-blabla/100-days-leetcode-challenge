## OLD METHOD OR ROOKIE VERSION : 
class Solution:
    def fib(self, n: int) -> int:

        if n==0 or n==1:
            return n
        else : 
            return self.fib(n-1)+self.fib(n-2)


## NEW AND UPDATED VERSION : 
class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n==0:
            return 0
        if n==1 or n==2 :
            return 1
        else:
            a,b=0,1
            for i in range (2,n+1):
                c=a+b
                a,b=b,c
            return b
        
