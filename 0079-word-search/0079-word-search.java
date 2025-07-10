class Solution {
    boolean ans;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] vis = new boolean[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0))
                ans = search(board,i,j,word,0,vis);
                if(ans)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board,int row,int col,String word,int index, boolean[][] vis)
    {
        if(index==word.length())
        return true;

        if(row>=board.length || row<0 || col<0 || col>=board[0].length || board[row][col]!=word.charAt(index) || vis[row][col]==true)
        
            return false;
            vis[row][col]=true;
            boolean opt1=search(board,row+1,col,word,index+1,vis);
            boolean opt2=search(board,row-1,col,word,index+1,vis);
            boolean opt3=search(board,row,col+1,word,index+1,vis);
            boolean opt4=search(board,row,col-1,word,index+1,vis);

            vis[row][col]=false;
            
    return opt1||opt2||opt3||opt4;
    }
}