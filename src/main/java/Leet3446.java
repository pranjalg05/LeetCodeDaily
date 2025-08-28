import java.util.ArrayList;
import java.util.Collections;

public class Leet3446 {
    public int[][] sortMatrix(int[][] grid) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int m = grid.length;
        int n = grid[0].length;
        int r = 0;
        int c = n - 1;

        while (c>=0) {

            int cr = r;
            int cc = c;
            while (cr < m && cc < n) {
                list.add(grid[cr][cc]);
                cr++;
                cc++;

            }

            cr = r;
            cc = c;
            Collections.sort(list);
            if(c==0)
                Collections.reverse(list);
            int i = -1;
            while (cr < m && cc < n) {
                grid[cr][cc] = list.get(++i);
                cr++;
                cc++;
            }
            list.clear();
            c--;

        }
        c = 0;
        while(r<m){
            int cr = r;
            int cc = c;
            while (cr < m && cc < n) {
                list.add(grid[cr][cc]);
                cr++;
                cc++;

            }

            cr = r;
            cc = c;
            Collections.sort(list);
            Collections.reverse(list);
            int i = -1;
            while (cr < m && cc < n) {
                grid[cr][cc] = list.get(++i);
                cr++;
                cc++;
            }
            list.clear();
            r++;
        }

        return grid;
    }
}
