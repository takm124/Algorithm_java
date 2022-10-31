package inflearn.section2_Array;

import java.util.Scanner;

public class Question5 { // 소수
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(solution(num));
    }

    private static int solution(int num) {
        int answer = 0;
        int[] arr = new int[num + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < num + 1; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < num + 1; j += i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

}
