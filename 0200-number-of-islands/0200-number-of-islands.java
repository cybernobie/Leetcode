class Solution {
    private int m, n;

    public void dfs(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == '0') return;

        grid[x][y] = '0';

        dfs(grid, x + 1, y); // Down
        dfs(grid, x - 1, y); // Up
        dfs(grid, x, y + 1); // Right
        dfs(grid, x, y - 1); // Left
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        m = grid.length;
        n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}
