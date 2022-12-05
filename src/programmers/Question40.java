package programmers;

import java.util.*;

public class Question40 { // 귤 고르기
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        ArrayList<Integer> arr = new ArrayList<>(map.values());
        arr.sort(Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            cnt += arr.get(i);
            if (cnt >= k) return i + 1;
        }

        return -1;
    }

    public int solution2(int k, int[] tangerine) { //timeout
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        int cnt = 0;
        int ans = 0;
        while (cnt < k) {
            int max = 0;
            int key = 0;
            for (int i : map.keySet()) {
                if (map.get(i) > max) {
                    max = map.get(i);
                    key = i;
                }
            }
            cnt += max;
            map.remove(key);
            ans++;
        }

        return ans;
    }
}
