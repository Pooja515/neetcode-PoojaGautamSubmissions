class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxlen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int x = num;
                int cnt = 1;
                while (set.contains(x+1)) {
                    cnt++;
                    x = x + 1;
                }
                maxlen = Math.max(maxlen, cnt);
            }
        }
        return maxlen;
    }
}
