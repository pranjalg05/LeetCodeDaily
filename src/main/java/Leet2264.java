


public class Leet2264 {
    public String largestGoodInteger(String num) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        int currentMax = -1;
        int currentChar = num.charAt(0);
        for (char c : num.toCharArray()) {

            if (c == currentChar) {
                if (sb.length() == 3)
                    continue;
                sb.append(c);
                if (sb.length() == 3) {
                    if ((c - '0') > currentMax) {
                        currentMax = c - '0';
                        ans = sb.toString();
                    }
                }
            } else {
                currentChar = c;
                sb.delete(0, sb.length()).append(c);
            }

        }
        return ans;
    }
}