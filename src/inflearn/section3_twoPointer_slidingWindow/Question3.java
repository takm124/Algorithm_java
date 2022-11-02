package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question3 { // 최대매출
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n1, n2));
    }

    private static int solution(int[] arr, int n, int length) {
        int max;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        max = sum;

        for (int i = length; i < n; i++) {
            sum += (arr[i] - arr[i - length]);
            max = Math.max(sum, max);
        }

        return max;
   }
}
