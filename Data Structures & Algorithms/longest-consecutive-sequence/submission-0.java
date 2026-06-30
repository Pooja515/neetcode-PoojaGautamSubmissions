class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
             set.add(nums[i]);
        }
        int maxi =0;
        for(int num : set){
           
            if(!set.contains(num -1)){
                int cnt =1;
                int x = num;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                maxi = Math.max(maxi , cnt);
            }
        }
        return maxi;
    }
}
