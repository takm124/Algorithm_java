package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question8 { // 수열 추측하기
    static int n, f;
    static int[] b, p, ch;
    int[][] dy = new int[35][35];
    boolean flag = false;

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Question8 T = new Question8();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        b = new int[n]; // 조합 저장
        p = new int[n]; // 순열 저장
        ch = new int[n+1]; // 중복이 아니기 때문에 체크
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n-1, i);
        }
        T.DFS(0, 0);
    }
}
