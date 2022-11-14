package inflearn.section7_Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Question13 { // 경로 탐색(인접리스트), 정점의 개수가 많을 때 사용
    static int n, m, answer = 0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Question13 T = new Question13();
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 정점의 개수
        m = in.nextInt(); // 간선의 개수
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }

    /*
5 9 (정점 개수, 간선 개수)
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
     */
}
