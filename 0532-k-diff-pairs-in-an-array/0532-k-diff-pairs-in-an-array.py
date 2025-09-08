class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        if k < 0:
            return 0

        num_count = {}
        for num in nums:
            num_count[num] = num_count.get(num, 0) + 1

        count = 0
        for num in num_count:
            if k == 0:
                if num_count[num] > 1:
                    count += 1
            else:
                if num + k in num_count:
                    count += 1

        return count