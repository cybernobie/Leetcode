class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(low==high)
            {
            return nums[low];
            }
            if(nums[low]<=nums[mid]&&nums[high]<nums[low])    //nums[m]>nums[m+1]
            {low=mid+1;}
            else
            {high=mid;}
            }
            return -1;
    }
}