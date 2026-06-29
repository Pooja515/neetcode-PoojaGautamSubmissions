class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int prev2 = nums[0] , prev1 = Math.max(nums[0] , nums[1]);
        for(int i = 2;i<n ; i++){
                int pick = nums[i] + prev2;
                int notpick = 0 + prev1;

                int cur = Math.max(pick , notpick);
                prev2 = prev1;
                prev1 = cur;
        }
    return prev1;
    }
}
