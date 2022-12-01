package programmers;

import java.util.PriorityQueue;

public class Question030 { // 더 맵게
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        solution(arr, 7);
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.offer(i);
        }

        int cnt = 0;
        while (pq.peek() <= K) {
            if (pq.size() <= 1 && pq.peek() <= K) return -1;

            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + (second * 2));
            cnt++;;

        }

        return cnt;
    }
}
