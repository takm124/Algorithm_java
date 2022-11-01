package inflearn.section2_Array;

import java.util.Scanner;

public class Question9 { // 격자판 최대합
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr, num));
    }

    private static int solution(int[][] arr, int num) {
        int max = 0;
        int sum = 0;

        // 행의 합
        for (int i = 0; i < num; i++) {
            sum = 0;
            for (int j = 0; j < num; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum, max);
        }


        // 열의 합
        for (int i = 0; i < num; i++) {
            sum = 0;
            for (int j = 0; j < num; j++) {
                sum += arr[j][i];
            }
            max = Math.max(sum, max);
        }


        // 대각선 합 (우하강)
        sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i][i];
        }
        max = Math.max(sum, max);

        // 대각선 합 (좌하강)
        sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i][num - 1 - i];
        }
        max = Math.max(sum, max);

        return max;
    }
}
