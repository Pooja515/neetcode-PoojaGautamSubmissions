class Solution {
    public int lengthOfLongestSubstring(String s) {
            HashMap<Character , Integer> map = new HashMap<>();
            int l=0 , r=0 , maxlen =0 , n = s.length();
            while(r < n){
                char[] c = s.toCharArray();
                if(map.containsKey(c[r])){
                    l= Math.max(l, map.get(c[r])+1);
                }
                map.put(c[r], r);
                maxlen = Math.max(maxlen , r-l+1);
                r++;
            }
         return maxlen;
    }
}
