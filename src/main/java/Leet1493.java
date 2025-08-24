

public class Leet1493 {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int current = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[right]==1)
                count++;
            if(nums[right]==0){
                if(count==0){
                    current++;
                    count++;
                } else {
                    while(nums[left]==0){
                        current--;
                        left++;
                    }
                }
            }
            max = Math.max(current, max);
        }
        return max;
    }
}
