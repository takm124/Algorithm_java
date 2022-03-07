package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question4 { // 연속부분수열
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
         * 8 6
         * 1 2 1 3 1 1 1 2
         */
    }

    private static void solution(int n, int m, int[] arr) {
        int lt = 0;
        int sum = 0;
        int answer = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum > m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

        System.out.println(answer);

    }
}
