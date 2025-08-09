import java.util.Arrays;

public class Leet1 {
    public int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum==target)
                return new int[]{left, right};
            if(sum>target)
                right--;
            else
                left++;
        }
        return new int[]{-1,-1};
    }
}
