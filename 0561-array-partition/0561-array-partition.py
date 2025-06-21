class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        pairsum=0
        for i in range(0,len(nums),+2):
            pairsum +=nums[i]
        return pairsum
        