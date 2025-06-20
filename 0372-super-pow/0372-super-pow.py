class Solution:
    def superPow(self, a: int, b: List[int]) -> int:

        i = int(''.join([str(j) for j in b]))

        return (pow(a, i, 1337))
        