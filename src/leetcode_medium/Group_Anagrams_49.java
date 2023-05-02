package leetcode_medium;

import java.util.*;

public class Group_Anagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            // 재정렬
            char[] cTmp = strs[i].toCharArray();
            Arrays.sort(cTmp);
            String sTmp = String.valueOf(cTmp);

            // anagram 확인
            if (!anagram.containsKey(sTmp)) {
                anagram.put(sTmp, new ArrayList<>());
            }

            // 해당하는 anagram 삽입
            anagram.get(sTmp).add(strs[i]);
        }

        return new ArrayList<>(anagram.values());

        /**
         * 리뷰 할점
         * Map의 Value에 List를 넣어 반환할 생각을 처음에 못했었음 -> 하나하나 넣을 생각
         * map.get(key).add(value) 방식
         * map.values()의 리턴 형식
         */
    }
}
