class Solution {
    public int singleNonDuplicate(int[] nums) {
                int low=0;
        int high=nums.length-1;
        int mid;
        while(low<high)
        {
            mid=(low+high)/2;

            if(mid%2==1)
            mid=mid-1;

            if(nums[mid]==nums[mid+1]) 
            {
                low=mid+2;
            }
            else
            {
                high=mid;
            }
            }
            return nums[low];
    }
}