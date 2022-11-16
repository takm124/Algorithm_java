package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question7 { // 조합의 경우수(메모이제이션)
    int[][] dy = new int[35][35]; // n <= 33

    public int DFS(int n, int r) { // 이렇게 하면 숫자가 커질 때 너무 오래 걸림
        if (n == r || r == 0) return 1;
        else {
            return DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public int DFS2(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Question7 T = new Question7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(T.DFS2(n, r));
    }
}
