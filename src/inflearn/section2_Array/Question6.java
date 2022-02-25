package inflearn.section2_Array;

import java.util.Scanner;

public class Question6 { // 뒤집은 소수
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
        for (int i = 0 ; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
            String s = sb.reverse().toString();
            int n = Integer.parseInt(s);
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
