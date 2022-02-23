package inflearn.section1_String;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s = in.next();
        System.out.println(solution(num, s));
    }

    private static String solution(int num, String s) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char) n;
            s = s.substring(7);
        }

        return answer;

    }
}
