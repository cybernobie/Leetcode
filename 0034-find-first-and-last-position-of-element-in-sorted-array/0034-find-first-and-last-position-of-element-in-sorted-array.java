class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right = findRight(nums,target);
        int left  = findLeft(nums,target);
        return new int[]{right,left};
    }
    private int findRight(int[] nums,int target)
    {
        int low=0,high=nums.length-1,index =-1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                index=mid;
                high=mid-1; // look more to the left
            }
            else if (nums[mid]<target)
            {
                low= mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return index;
    }



        private int findLeft(int[] nums,int target)
    {
        int low=0,high=nums.length-1,index =-1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                index=mid;
                low = mid+1; // look more to the right
            }
            else if (nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return index;
    }
}