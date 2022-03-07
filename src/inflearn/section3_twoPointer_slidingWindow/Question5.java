package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question5 { // 연속된 자연수 합
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
