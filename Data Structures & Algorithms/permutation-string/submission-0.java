class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (n < m)
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < m; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int cnt =m;
        int l=0;
        for(int r=0;r<n;r++){
            if(freq[s2.charAt(r)-'a'] > 0) cnt--;
            freq[s2.charAt(r)-'a']--;

            if(cnt == 0) return true;
            if(r-l+1 == m){
                int left= s2.charAt(l);
                if(freq[left-'a'] >= 0) cnt++;
                freq[left-'a']++;
                l++;
            }


        }
        return false;
    }
}
