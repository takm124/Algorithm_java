package inflearn.section10_dynamic_programming;

import java.util.Scanner;

public class Question3 { // 최대부분증가수열(LIS)

    static int[] dy;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dy = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n));
    }

    public static int solution(int[] arr, int n) {
        int ans = 0;
        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            ans = Math.max (ans, dy[i]);
        }

        return ans;
    }

}
