import java.util.Arrays;

public class Leet869 {
    public boolean reorderedPowerOf2(int n){
        char[] charArray = Integer.toString(n).toCharArray();
        Arrays.sort(charArray);
        String s = String.valueOf(charArray);
        int i = 1;
        while(i>0&&i<=1073741824){
            char[] c = Integer.toString(i).toCharArray();
            Arrays.sort(c);
            String j = String.valueOf(c);
            if(s.equals(j)) return true;
            i *= 2;
        }
        return false;
    }
}
