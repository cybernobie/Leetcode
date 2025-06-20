class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = nums[0]
        cursum = nums[0]

        for num in nums[1:]:
            cursum = max(num,cursum + num)
            maxSum = max(maxSum, cursum)

        return maxSum