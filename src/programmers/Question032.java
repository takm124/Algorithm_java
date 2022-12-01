package programmers;

import java.util.*;


public class Question032 { // 피로도

    int[] ch;
    int ans;

    public int solution(int k, int[][] dungeons) {
        ch = new int[dungeons.length];
        DFS(0, k, dungeons);

        return ans;
    }

    public void DFS(int L, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (ch[i] == 0 && dungeons[i][0] <= k) {
                ch[i] = 1;
                DFS(L + 1, k - dungeons[i][1], dungeons);
                ch[i] = 0;
            }
        }

        ans = Math.max(ans, L);
    }
}
