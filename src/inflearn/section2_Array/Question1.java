package inflearn.section2_Array;

import java.util.Scanner;

public class Question1 { // 큰 수 출력하기
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
        int tmp = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] > tmp) {
                System.out.print(arr[i] + " ");
            }
            tmp = arr[i];
        }
    }
}
