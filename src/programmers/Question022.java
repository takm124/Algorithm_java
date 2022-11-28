package programmers;

import java.util.HashMap;
import java.util.Map;

public class Question022 { // 위장
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }

        if (map.size() == 1) return map.get(clothes[0][1]);

        for (int i : map.values()) {
            answer *= (i+1);
        }

        return answer;
    }
}