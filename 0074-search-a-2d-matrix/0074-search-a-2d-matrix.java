class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = row*column-1;
        int m,mid;

        while(low<=high)
        {
            mid=low+(high-low)/2;
            m= matrix[mid/column][mid%column];
            if(m==target)
            {
                return true;
            }
            else if(m>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return false;
    }
}