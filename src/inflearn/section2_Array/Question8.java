package inflearn.section2_Array;

import java.util.Scanner;

public class Question8 { // 등수 구하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i ++) {
            arr[i] = in.nextInt();
        }

        solution(num, arr);
    }

    private static void solution(int num, int[] arr) {
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[i] < arr[j]) answer[i]++;
            }
        }

        for (int i : answer) {
            System.out.print((i + 1) + " ");
        }
    }
}
