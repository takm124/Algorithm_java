package inflearn.section2_Array;

import java.util.Scanner;

public class Question2 { // 보이는 학생
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
