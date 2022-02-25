package inflearn.section2_Array;

import java.util.Scanner;

public class Question2 { // 보이는 학생
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i ++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(num, arr));
    }

    private static int solution(int num, int[] arr) {
        int answer = 1;
        int tallest = arr[0];

        for (int i : arr) {
            if (i > tallest) {
                answer++;
                tallest = i;
            }
        }

        return answer;
    }
}
