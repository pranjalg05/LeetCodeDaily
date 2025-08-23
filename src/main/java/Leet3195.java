public class Leet3195 {
    public int minimumArea(int[][] grid) {
        int minright = 1000;
        int mindown = 1000;
        int right = -1;
        int down = -1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++ ){
                if(grid[i][j]==1){
                    minright = j>minright? right:j;
                    mindown = i>mindown? mindown:i;
                    right = j>right? j:right;
                    down = i>down? i:down;
                }
            }
        }
        return (right-minright+1)*(down-mindown+1);
    }
}
