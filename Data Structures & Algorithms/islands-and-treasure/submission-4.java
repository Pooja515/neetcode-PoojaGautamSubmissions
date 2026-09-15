class Solution {
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int INF = 2147483647;

        Queue<int[]> q= new LinkedList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if(grid[r][c] == 0){
                    q.offer(new int[] {r,c});
                }
            }
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0] , c=cur[1];
            for(int[] d:dir){
                int newr = r+d[0] , newc = c+d[1];
                if(newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == INF){
                    grid[newr][newc] = grid[r][c] +1;
                    q.offer(new int[] {newr,newc});
                }
            }
        }
    }
}
