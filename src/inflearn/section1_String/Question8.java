package inflearn.section1_String;

import java.util.Scanner;

public class Question8 { // 유효한 팰린드롬
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)) return "YES";

        return "NO";
    }
}
