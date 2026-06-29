class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr1= new int[n-1];
        int[] arr2= new int[n-1];
        if(n==1) return nums[0];
        for(int i =0 ;i<n-1;i++){
            arr1[i] = nums[i];
        }
        for(int i =1 ;i<n;i++){
            arr2[i-1] = nums[i];
        }

        int excludeEnd = f(arr1);
        int excludeFirst = f(arr2);

        return Math.max(excludeEnd, excludeFirst);

    }

      int f(int[] nums) {
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
