class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0 , r = n-1 , maxi = 0;
        while(l < r){
            int len = Math.min(heights[l] , heights[r]);
            int breadth = r - l;
            maxi = Math.max(maxi, (len * breadth));
            if(heights[l] < heights[r]) l++;
            else
                   r--;
        }
        return maxi;
    }
}
