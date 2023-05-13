package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Question044 { // 숫자 변환하기
    public int solution(int x, int y, int n) {
        int[] arr = new int[1000001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        arr[x] = 1;

        while (!q.isEmpty()) {
            int num = q.poll();

            if (num + n <= 1000000 && arr[num+n] == 0) {
                arr[num+n] = arr[num] + 1;
                q.offer(num+n);
            }

            if (num * 2 <= 1000000 && arr[num*2] == 0) {
                arr[num*2] = arr[num] + 1;
                q.offer(num*2);
            }

            if (num * 3 <= 1000000 && arr[num*3] == 0) {
                arr[num*3] = arr[num] + 1;
                q.offer(num*3);
            }
        }

        return arr[y]-1;
    }
}
