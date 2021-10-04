package leetcode;

import java.util.*;

public class Jewels_and_Stones_771 {
    public int numJewelsInStones(String jewels, String stones) { // HashMap 사용
        Map<Character, Integer> map = new HashMap<>();

        for (char c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int sum = 0;
        for (char c : jewels.toCharArray()) {
            if (map.containsKey(c)) {
                sum += map.get(c);
            }
        }

        return sum;
    }

    public int numJewelsInStones2(String jewels, String stones) { //indexOf 사용
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
