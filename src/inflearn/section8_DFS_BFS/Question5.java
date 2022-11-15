package inflearn.section8_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question5 { // 동전 교환
    static int cnt = 0;
    static int[] coins;
    static Queue<Integer> q = new LinkedList<>();

    public int BFS(int n, int m) {
        while (!q.isEmpty()) {
            cnt++;
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int val = q.poll();
                for (int j = 0; j < n; j++) {
                    int data = val + coins[j];
                    if (data == m) {
                        return cnt+1;
                    }
                    if (data < m) q.offer(data);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Question5 T = new Question5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 동전 종류
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }
        int m = in.nextInt(); // 거슬러 줄 돈

        for (int x : coins) {
            q.offer(x);
        }
        System.out.println(T.BFS(n, m));
    }
}
