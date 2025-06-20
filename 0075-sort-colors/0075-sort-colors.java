class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int right=(nums.length)-1;
        int temp;
    while(mid<=right)
    {
        if(nums[mid]==0)
        {
            temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            mid++;
            low++;

        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            temp = nums[right];
            nums[right] = nums[mid];
            nums[mid] = temp;
            right--;
        }
    }
    }
}