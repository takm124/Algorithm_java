package inflearn.section2_Array;

import java.util.Scanner;

public class Question4 { // 피보나치 수열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i : solution(num)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 0; i < num - 2; i++) {
            arr[i + 2] = arr[i + 1] + arr[i];
        }

        return arr;
    }
}
