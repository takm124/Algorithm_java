package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question3 { // 최대 매출
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(n, m, arr);

        /**
         * 10 3
         * 12 15 11 20 25 10 20 19 13 15
         */
    }

    private static void solution(int n, int m, int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
