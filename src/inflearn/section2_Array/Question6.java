package inflearn.section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question6 { // 뒤집은 소수
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
        StringBuilder sb;
        List<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            sb = new StringBuilder(String.valueOf(i));
            sb.reverse();

            int tmp = Integer.valueOf(sb.toString());
            if (tmp > 1 && checkPrime(tmp)) {
                answer.add(tmp);
            }
        }

        return answer;
    }

    private static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

}
