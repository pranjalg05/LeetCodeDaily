

public class Leet2438 {
    public int[] productQueries(int n, int[][] queries) {
        int i = -1;
        final long M = 1000000007;
        double[] arr = new double[32];
        for (int j = 0; j < 32; j++) {
            if((n>>j&1)==1)
                arr[++i] = Math.pow(2, j);
        }
        int[] ans = new int[queries.length];
        int k = -1;
        for(int[] q: queries){
            int current = 1;
            for (int j = q[0]; j <= q[1] ; j++) {
                current = (int) ((arr[j]*current)%M);
            }
            ans[++k] = current;
        }
        return ans;
    }
}
