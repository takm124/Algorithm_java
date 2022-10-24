package inflearn.section1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 { // 단어 뒤집기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.next();
        }

        for (String s : solution(num, arr)) {
            System.out.println(s);
        }
    }

    private static List<String> solution(int num, String[] arr) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            answer.add(sb.toString());
        }

        return answer;
    }
}
