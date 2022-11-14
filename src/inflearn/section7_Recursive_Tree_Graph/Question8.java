package inflearn.section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question8 { //송아지 찾기(BFS, 최단거리 알고리즘)
    static int answer = 0;
    static int[] dis = {1, -1, 5};
    static int[] ch; // 방문한 위치인지 확인
    static Queue<Integer> Q = new LinkedList<>();

    public static int BFS(int s, int e) {
        // 가능성에 따라 가지의 갯수가 정해지는 점이 포인트
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int n = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = n+dis[j];
                    if (nx == e) return L+1;
                    if (nx >=1 && nx <= 10000 && ch[nx] == 0) {
                        Q.offer(nx);
                        ch[nx] = 1;
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(BFS(s, e));
    }
}
