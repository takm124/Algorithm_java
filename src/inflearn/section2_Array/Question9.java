package inflearn.section2_Array;

import java.util.Scanner;

public class Question9 { // 격자판 최대합
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
         * 10 13 10 12 15
         * 12 39 30 23 11
         * 11 25 50 53 15
         * 19 27 29 37 27
         * 19 13 30 13 19
         */

    }

    private static int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int res1 = 0;
            int res2 = 0;

            for (int j = 0; j < n; j++) {
                res1 += arr[i][j];
                res2 += arr[j][i];
            }
            max = Math.max(res1, max);
            max = Math.max(res2, max);
        }

        // 대각선
        int res3 = 0;
        int res4 = 0;
        for (int i = 0; i < n; i++) {
            res3 += arr[i][i];
            res4 += arr[n - 1 - i][i];
        }

        max = Math.max(res3, max);
        max = Math.max(res4, max);

        return max;
    }
}
