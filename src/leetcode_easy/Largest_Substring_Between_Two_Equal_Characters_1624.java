package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class Largest_Substring_Between_Two_Equal_Characters_1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    ans = Math.max(ans, (j - i - 1));
                }
            }
        }
        return ans;
    }

    public int maxLengthBetweenEqualCharacters2(String s) {
        int ans = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                ans = Math.max(ans, i - 1 - map.get(c));
            }
            else {
                map.put(c, i);
            }
        }
        return ans;
    }
}
