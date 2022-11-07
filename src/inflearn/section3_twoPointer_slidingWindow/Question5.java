package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question5 { // 연속된 자연수의 합
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int cnt = 0;
        int sum = 0;
        int lp =0;
        int[] arr = new int[n];
        for (int i = 0; i < (n/2 + 1); i++) arr[i] = i + 1;
        for (int rp = 0; rp < (n/2 + 1); rp++) {
            sum += arr[rp];
            if (sum == n) cnt++;

            while (sum >= n) {
                sum -= arr[lp++];
                if (sum == n) cnt++;
            }
        }

        return cnt;
   }
}
