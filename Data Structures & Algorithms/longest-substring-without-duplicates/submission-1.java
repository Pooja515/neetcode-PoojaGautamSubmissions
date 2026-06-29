class Solution {
    public int lengthOfLongestSubstring(String s) {
            HashMap<Character , Integer> map = new HashMap<>();
            int l=0 , r=0 , maxlen =0 , n = s.length();
            while(r < n){
                char c = s.charAt(r);
                if(map.containsKey(c)){
                    l= Math.max(l, map.get(c)+1);
                }
                map.put(c, r);
                maxlen = Math.max(maxlen , r-l+1);
                r++;
            }
         return maxlen;
    }
}
