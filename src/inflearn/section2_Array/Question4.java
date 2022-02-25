package inflearn.section2_Array;

import java.util.Scanner;

public class Question4 { // 피보나치 수열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        solution(n);
    }

    private static void solution(int n) {
        int prevPrevNum = 1;
        int prevNum = 1;
        System.out.print("1 1 ");
        for (int i = 0; i < n - 2; i++) {
            int curNum = prevPrevNum + prevNum;
            System.out.print(curNum + " ");
            prevPrevNum = prevNum;
            prevNum = curNum;
        }

    }
}
