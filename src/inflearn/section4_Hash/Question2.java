package inflearn.section4_Hash;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 { // 아나그램
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        solution(s1, s2);
    }

    private static void solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) != 0) answer = "NO";
        }

        System.out.println(answer);
    }
}
