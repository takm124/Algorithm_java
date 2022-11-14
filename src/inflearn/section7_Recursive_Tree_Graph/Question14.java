package inflearn.section7_Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question14 { // 그래프 최단거리(BFS), 최단거리는 웬만하면 BFS
    static int n, m;
    static int[] ch, dis;
    static ArrayList<ArrayList<Integer>> graph;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Question14 T = new Question14();
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 정점의 개수
        m = in.nextInt(); // 간선의 개수
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.print(dis[i] + " ");
        }
    }
}

/*
6 9 (정점의 개수, 간선의 개수)
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

 */
