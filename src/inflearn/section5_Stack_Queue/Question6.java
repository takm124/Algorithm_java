package inflearn.section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question6 { // 공주구하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println(solution(n1, n2));

    }


    private static int solution(int num, int fail) {
        int ans = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            queue.offer(i + 1);
        }

        int cnt = 1;
        while (queue.size() > 1) {
            if (cnt == fail) {
                queue.poll();
                cnt = 1;
            } else {
                queue.offer(queue.poll());
                cnt++;
            }
        }

        return queue.peek();
   }

}
