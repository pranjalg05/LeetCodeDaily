import java.util.Arrays;

public class Leet221 {

    static int recurse(char[][] matrix, int row, int col, int[][] dp) {

        if(row==matrix.length||col==matrix[0].length) return  0;

        if(dp[row][col]!=-1) return dp[row][col];

        if(matrix[row][col]=='0') return dp[row][col] = 0;

        int right = recurse(matrix, row, col+1, dp);
        int down = recurse(matrix, row+1, col, dp);
        int dia = recurse(matrix, row+1, col+1, dp);

        return dp[row][col] = 1 + Math.min(right, (Math.min(down, dia)));
    }


    public int maximalSquare(char[][] matrix) {

        int ans = 0;

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int possible = recurse(matrix, i, j, dp);
                ans = Math.max(possible, ans);
            }
        }

        return ans*ans;

    }
}
