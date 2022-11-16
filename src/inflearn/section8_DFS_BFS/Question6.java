package inflearn.section8_DFS_BFS;

import java.util.Scanner;

public class Question6 { //순열 구하기

    static int n, m;
    static int[] pm, ch, arr;

    //3 2
    //3 6 9

    public void DFS(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        Question6 T = new Question6();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];
        ch = new int[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        T.DFS(0);
    }
}
