package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question9 { // 조합 구하기
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s) { // L : 레벨, s : 시작 넘버
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Question9 T = new Question9();
        Scanner in =new Scanner(System.in);
        n = in.nextInt(); // 1~n 구슬
        m = in.nextInt(); // M개 뽑음
        combi = new int[m];
        T.DFS(0, 1);
    }

}
