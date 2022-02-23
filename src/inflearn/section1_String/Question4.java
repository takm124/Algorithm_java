package inflearn.section1_String;

import java.util.Scanner;

public class Question4 { // 단어 뒤집기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String[] sArr = new String[num];
        for (int i = 0; i < num; i++) {
            sArr[i] = in.next();
        }

        for (String s : solution(num, sArr)) {
            System.out.println(s);
        }
    }

    public static String[] solution(int num, String[] sArr) {
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = new StringBuilder(sArr[i]).reverse().toString();
        }

        return arr;
    }
}
