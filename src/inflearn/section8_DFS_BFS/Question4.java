package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question4 { // 중복순열 구하기
    // 1부터 N까지 있는 구슬을 M번 뽑기
    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }


    public static void main(String[] args) {
        Question4 T = new Question4();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
