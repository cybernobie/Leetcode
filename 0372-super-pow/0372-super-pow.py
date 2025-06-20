class Solution:
    def superPow(self, a: int, b: List[int]) -> int:
        i = int(''.join(map(str, b)))

        return (pow(a,i,1337))
        