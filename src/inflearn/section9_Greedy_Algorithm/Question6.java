package inflearn.section9_Greedy_Algorithm;

import java.util.Scanner;

public class Question6 { // 친구인가?(Disjoint-Set, Union&Find), 서로소 집합 구하기
    static int[] unf;

    public static int Find(int v) { //v번 학생의 집합번호 리턴
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            Union(a, b);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
