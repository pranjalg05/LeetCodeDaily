

public class Leet2348 {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int n: nums){
            if(n==0){
                count++;
                ans += count;
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
}
