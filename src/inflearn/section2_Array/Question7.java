package inflearn.section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7 { // 점수 계산
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, num));
    }

    private static int solution(int[] arr, int num) {
        int answer = 0;
        int point = 1;

        if (arr[0] == 1) answer += point;

        for (int i = 1; i < num; i++) {
            if (arr[i] == 1) {
                if (arr[i - 1] == 1) {
                    point++;
                    answer += point;
                } else {
                    point = 1;
                    answer += point;
                }
            }
        }

        return answer;
    }
}
