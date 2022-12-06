package programmers;

import java.util.HashSet;
import java.util.Set;

public class Question42 { // 소수 찾기

    boolean ch[];
    Set<Integer> set;
    public int solution(String numbers) {
        char[] arr = numbers.toCharArray();
        ch = new boolean[arr.length];
        set = new HashSet<>();

        String s= "";

        DFS(0, arr, s);
        return set.size();
    }

    public void DFS(int L, char[] arr, String s) {
        if (L > arr.length) return;

        if (s != "" && s != null) {
            int num = Integer.parseInt(s);
            if (isPrime(num)) set.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!ch[i]) {
                ch[i] = true;
                DFS(L+1, arr, s + arr[i]);
                ch[i] = false;
            }
        }

    }

    public boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
