package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question3 { // 최대점수 구하기(DFS)
    static int n, m, answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time, int[] Q, int[] QT) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum + Q[L], time + QT[L], Q, QT);
            DFS(L+1, sum, time, Q, QT);
        }
    }

    public static void main(String[] args) {
        Question3 T = new Question3();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }

        T.DFS(0,0, 0, a, b);
        System.out.println(answer);
    }
}
