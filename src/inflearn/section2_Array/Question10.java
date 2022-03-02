package inflearn.section2_Array;

import java.util.Scanner;

public class Question10 { // 봉우리
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, arr));

        /**
         * 5
         * 5 3 7 2 3
         * 3 7 1 6 1
         * 7 2 5 3 4
         * 4 3 6 4 1
         * 8 7 3 5 2
         */
    }

    private static int solution(int n, int[][] arr) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;
            }
        }

        return count;

    }
}
