package leetcode_easy;

import java.util.HashMap;

public class Permutation_in_String_567 {
    public boolean checkInclusion(String s1, String s2) {
        int lt = 0 ;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s1.length() > s2.length()) {
            return false;
        }


        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }


        for (int i = 0; i < s1.length() - 1; i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (int rt = s1.length() - 1; rt < s2.length(); rt++){
            map2.put(s2.charAt(rt), map2.getOrDefault(s2.charAt(rt), 0) + 1);

            if (map1.equals(map2)) {
                return true;
            }

            map2.put(s2.charAt(lt), map2.get(s2.charAt(lt)) - 1);

            if (map2.get(s2.charAt(lt)) == 0) {
                map2.remove(s2.charAt(lt));
            }

            lt++;
        }

        return false;
    }
}
