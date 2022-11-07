package inflearn.section4_Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 { // 학급 회장 (해쉬)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n, s));
    }

    private static char solution(int len, String s) {
        char ans = ' ';
        Map<Character, Integer> tmp = new HashMap<>();
        for (char c : s.toCharArray()) {
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Character c : tmp.keySet()) {
            if (max < tmp.get(c)) {
                ans = c;
                max = tmp.get(c);
            }
        }

        return ans;
   }
}
