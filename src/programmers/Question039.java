package programmers;

import java.util.*;

class Point{
    int x;
    int y;
    int move;

    public Point(int x, int y, int move) {
        this.x = x;
        this.y = y;
        this.move =  move;
    }
}

public class Question039 { // 게임 맵 최단거리
    public int solution(int[][] maps) {
        boolean[][] ch = new boolean[maps.length][maps[0].length];
        int[] dx = {0, -1, 0, 1}; // 상 좌 하 우
        int[] dy = {1, 0, -1, 0};
        int ans = -1;

        Point p = new Point(0, 0, 1);
        Queue<Point> queue = new LinkedList<>();;
        queue.offer(p);

        ch[0][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.x == maps.length-1 && cur.y == maps[0].length-1) {
                ans = cur.move;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) continue;

                if(!ch[nx][ny] && maps[nx][ny] == 1) {
                    ch[nx][ny] = true;
                    queue.offer(new Point(nx, ny, cur.move + 1));
                }
            }
        }

        return ans;
    }
}
