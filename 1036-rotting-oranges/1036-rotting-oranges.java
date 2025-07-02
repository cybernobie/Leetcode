class Pair
{
    int i;
    int j;
    int t;
    Pair(int i,int j,int t)
    {
        this.i=i;
        this.j=j;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                q.add(new Pair(i,j,0));
            }
        }
    
    int max=0;
    while(!q.isEmpty())
    {
        Pair pr = q.poll();
        int i = pr.i;
        int j = pr.j;
        int t = pr.t;

        max = Math.max(t,max);

        if(i-1 >=0 && grid[i-1][j]==1)
        {
            grid[i-1][j]=2;
            q.add(new Pair(i-1,j,t+1));
        }

           if(j-1 >=0 && grid[i][j-1]==1)
        {
            grid[i][j-1]=2;
            q.add(new Pair(i,j-1,t+1));
        }
           if(i+1 <n && grid[i+1][j]==1)
        {
            grid[i+1][j]=2;
            q.add(new Pair(i+1,j,t+1));
        }
            if(j+1 < m && grid[i][j+1]==1)
        {
            grid[i][j+1]=2;
            q.add(new Pair(i,j+1,t+1));
        }
    }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        
    
    return max;
    }
}