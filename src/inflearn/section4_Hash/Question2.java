package inflearn.section4_Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 { // 아나 그램 (해쉬)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.println(solution(s1, s2));
    }

    private static String solution(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) return "NO";
        }

        return "YES";
   }
}
