class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n)
            return "";

        int[] freq = new int[128];

        for (int i = 0; i < n; i++) {
            freq[t.charAt(i)]++;
        }

        int l = 0, start = 0, cnt = n, maxlen = Integer.MAX_VALUE;
        
        for (int i = 0; i < m; i++) {
            if (freq[s.charAt(i)] > 0){
                 cnt--;
            }
        
            freq[s.charAt(i)]--;

            while (cnt == 0) {
                if (i - l + 1 < maxlen) {
                    maxlen = i - l + 1;
                    start = l;
                }
                freq[s.charAt(l)]++;
                if (freq[s.charAt(l)] > 0){
                    cnt++;
                }
               
                l++;
            }
        }
        return maxlen == Integer.MAX_VALUE ? "" : s.substring(start, start + maxlen);
    }
}
