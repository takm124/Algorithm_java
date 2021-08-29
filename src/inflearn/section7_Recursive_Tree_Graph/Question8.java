package inflearn.section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Question8 {
    int[] dis = {1, -1, 5}; //이동 할 수 있는 방법
    int[] ch; //한 번 방문한 곳 확인용
    Queue<Integer> Q = new LinkedList<>();

    /**
     * @param s : 시작 위치
     * @param e : 목표 위치
     * @return : 최소 횟수
     */
    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1; //출발 지점, 1이면 들렸고 0이면 안들린 위치
        Q.offer(s);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int d : dis) {
                    int nx = x + d; //자식 노드 생성
                    if (nx == e) return level + 1; //자식이 목표 위치인지 확인해서 return
                    if (nx >= 1 && nx <=10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
