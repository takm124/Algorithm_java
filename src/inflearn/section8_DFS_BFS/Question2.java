package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question2 { // 바둑이 승차(DFS)
    static int max, n, limit;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > limit) return;
        if (L == n) {
            max = Math.max(max, sum);
        } else {
            DFS(L+1 ,sum+arr[L], arr);
            DFS(L+1 ,sum, arr);
        }
    }

    public static void main(String[] args) {
        Question2 T = new Question2();
        Scanner in = new Scanner(System.in);
        limit = in.nextInt();
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        T.DFS(0,0, arr);
        System.out.println(max);
    }

}
