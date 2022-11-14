package inflearn.section7_Recursive_Tree_Graph;

import java.util.Scanner;

public class Question12 { // 경로 탐색(인접행렬)
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 밑으로 갔다왔으니까 체크 풀어줘야함
                }
            }
        }
    }

    public static void main(String[] args) {
        Question12 T = new Question12();
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 정점의 개수
        m = in.nextInt(); // 간선의 개수
        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1; // 1번에서 시작하니까
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
