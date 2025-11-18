class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX
        
        positive = (dividend >= 0) == (divisor >= 0)
        
        a = dividend if dividend < 0 else -dividend
        b = divisor if divisor < 0 else -divisor
        
        quotient = 0
        while a <= b:
            temp = b
            multiple = 1
            while temp >= (INT_MIN >> 1) and a <= (temp << 1):
                temp <<= 1
                multiple <<= 1
            a -= temp
            quotient += multiple
        
        if not positive:
            quotient = -quotient
        
        return min(max(quotient, INT_MIN), INT_MAX)