# Method I
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        n = len(digits)
        if digits[n-1] !=9:
            digits[n-1]+=1
            return digits
        
        else : 
            r = 0
            for digit in digits :
                r = r*10 + digit
            r += 1
            
            new_list = [int(digit) for digit in str(r)]
            return new_list

# Method II
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        num=int("".join(map(str,digits)))
        num+=1
        return [int(digit) for digit in str(num)]
