package leetcode_medium;

public class Unique_Paths_62 {
    public int uniquePaths(int x, int y) {

        /**
         * 처음에 문제 보자마자 DFS로 풀면되겠다! 라고 생각했는데 time limit가 발생해서 당황했다.
         * 차분히 생각해보니 학창시절 사용했던 이동경로 수학 공식을 사용하면 편하게 해결될 문제였다.
         * 너무 공식처럼 문제를 풀지 않게 경각심을 좀 가져야겠다.
         */

        int[][] board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || j == 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = board[i-1][j] + board[i][j-1];
                }
            }
        }

        return board[x-1][y-1];
    }
}
