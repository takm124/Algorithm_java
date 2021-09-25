package leetcode;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int lt = 0;
        int rt = 0;

        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        while (rt < s.length()) {
            if (!set.contains(s.charAt(rt))) {
                set.add(s.charAt(rt++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(lt++));
            }
        }
        return max;
    }
}
