import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet2787 {

    final int M = 1000000007;

    public int numberOfWays(int n, int x) {

        List<Long> list = new ArrayList<>();
        for (int i = 1; Math.pow(i, x) <= n; i++) {
            long pow = (long) Math.pow(i, x);
            list.add(pow);
        }
        int[][] mem = new int[n + 1][list.size()];
        for (int[] row : mem) {
            Arrays.fill(row, -1);
        }
        return dp(n, list, list.size() - 1, mem);

    }

    int dp(int n, List<Long> list, int idx, int[][] mem) {

        if (n == 0) return 1;

        if (n < 0 || idx < 0) return 0;

        if (mem[n][idx] != -1)
            return mem[n][idx];

        int pick = 0;
        long current = list.get(idx);
        if (current <= n)
            pick = dp((int) (n - current), list, idx - 1, mem);

        int notpick = dp(n, list, idx - 1, mem);

        return mem[n][idx] = (pick + notpick) % M;
    }

}
