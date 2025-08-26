public class Leet3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int ans = 0;
        for (int[] rectangle : dimensions) {
            var current = Math.sqrt(rectangle[0] * rectangle[0] + rectangle[1] * rectangle[1]);
            if (max < current) {
                ans = rectangle[0] * rectangle[1];
                max = current;
            }
            else if(max==current){
                ans = Math.max(ans, rectangle[0]*rectangle[1]);
            }
        }
        return ans;
    }
}
