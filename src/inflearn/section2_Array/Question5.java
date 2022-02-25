package inflearn.section2_Array;

import java.util.Scanner;

public class Question5 { // 소수 (에라토스테네스 체)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] arr = new int[n + 1];
        int count = 0;

        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                count++;
                for (int j = i; j < n + 1; j += i) {
                    if (arr[j] == 0) arr[j] = 1;
                }
            }
        }

        return count;
    }
}
