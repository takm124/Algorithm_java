package programmers;

import java.util.Collections;
import java.util.PriorityQueue;


public class Question025 { // 프린터
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    if (i == location) return ans + 1;
                    pq.poll();
                    ans++;
                }
            }
        }

        return -1;
    }
}