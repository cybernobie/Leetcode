class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        
        low, high = 2, x // 2
        while low <= high:
            mid = (low + high) // 2
            square = mid * mid
            
            if square == x:
                return mid
            elif square < x:
                low = mid + 1
            else:
                high = mid - 1
        
        return high