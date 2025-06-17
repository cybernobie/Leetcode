class Solution {
    public int trap(int[] height) {
        int leng = height.length;

        int right_arr[] = new int[leng];
        int left_arr[] = new int[leng];

        left_arr[0]=height[0];

        for(int i=1;i<leng;i++)
        left_arr[i]=Math.max(left_arr[i-1],height[i]);
        right_arr[leng-1]=height[leng-1];    

        for(int i=leng-2;i>=0;i--)
        right_arr[i]=Math.max(right_arr[i+1],height[i]);
        int result = 0;

        for (int i=0;i<leng;i++)
        result+=(Math.min(left_arr[i],right_arr[i])-height[i]);
        return result;
        
    }
}