package inflearn.section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 { // 큰 수 출력하기
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

    private static List<Integer> solution(int[] arr, int num) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if (arr[i - 1] < arr[i]) tmp.add(arr[i]);
        }

        return tmp;
    }
}
