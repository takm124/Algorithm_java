package programmers;

import java.util.Arrays;

public class Question027 { // 전화번호 목록 (startWith)
    public static void main(String[] args) {
        String[] arr = {"119", "97674223", "1195524421"};
        System.out.println(solution(arr));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String s1 = phone_book[i];
            String s2 = phone_book[i + 1];

            if (s1.length() > s2.length()) {
                if (s1.startsWith(s2)) return false;
            } else {
                if (s2.startsWith(s1)) return false;
            }
        }

        return true;
    }

    public static boolean solution2(String[] phone_book) { // 효율성 통과 못함
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String s = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++ ) {
                if (phone_book[j].startsWith(s)) return false;
            }
        }

        return true;
    }
}
