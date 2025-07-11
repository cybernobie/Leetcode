import java.util.ArrayList;

class Solution
{
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n){
        int [][] grid =  new int[n][n];
        solve(grid,0);
        return ans;
    }

    public void addAns(int [][] grid)
    {
        List<String> ls = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            String curr="";
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i][j]==0)
                {
                    curr+=".";
                }
                else{
                    curr+="Q";
                }
            }
            ls.add(curr);
        }
        ans.add(ls);
    }
    public void solve(int[][] grid, int row)
    {
        if(grid.length==row)
        {
            addAns(grid);
            return;
        }
        for(int j=0;j<grid.length;j++)
        {
            if(isPossible(row,j,grid))
            {
                grid[row][j]=1;
                solve(grid,row+1);
                grid[row][j]=0;
            }
        }
    }
    public boolean isPossible(int row,int col,int[][] grid)
    {
        int x = row;
        int y = col;

        while(x>=0)
        {
            if(grid[x--][y]==1) return false;
        }

        // left diagonal

        x = row;
        y = col;
        while(x>=0 && y>=0)
        {
            if(grid[x--][y--]==1)
            return false;
        }

        // right diagonal
        x = row;
        y = col;
        while(x>=0 && y<grid.length)
        {
            if(grid[x--][y++]==1) return false;
        } 
        return true;

    }

}