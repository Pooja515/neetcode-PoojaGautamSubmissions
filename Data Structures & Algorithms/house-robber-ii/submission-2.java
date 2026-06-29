class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        

        return Math.max(f(nums,0,n-2), f(nums,1,n-1));

    }

      int f(int[] nums , int s, int e) {
        int n = nums.length;

        
        int prev2 = 0, prev1 = 0;
        for(int i = s;i<=e ; i++){
                int pick = nums[i] + prev2;
                int notpick = 0 + prev1;

                int cur = Math.max(pick , notpick);
                prev2 = prev1;
                prev1 = cur;
        }
    return prev1;
    }
}
