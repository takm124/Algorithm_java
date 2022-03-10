package inflearn.section4_Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 { // 학급회장
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();

        solution(n, s);
    }

    private static void solution(int n, String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                answer = key;
                max = map.get(key);
            }
        }

        System.out.println(answer);
    }
}
