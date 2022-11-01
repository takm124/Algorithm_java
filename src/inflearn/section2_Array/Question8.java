package inflearn.section2_Array;

import java.util.Scanner;

public class Question8 { // 등수 구하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : solution(arr, num)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] arr, int num) {
        int[] answer = new int[num];
        int cnt = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i != j) {
                    if (arr[j] > arr[i]) cnt++;
                }
            }
            answer[i] = cnt;
            cnt = 1;
        }

        return answer;
    }
}
