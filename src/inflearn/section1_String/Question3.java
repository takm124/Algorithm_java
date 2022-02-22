package inflearn.section1_String;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String[] arr = s.split(" ");
        String answer = "";

        for (String st : arr) {
            if (st.length() > answer.length()) answer = st;
        }

        return answer;
    }
}
