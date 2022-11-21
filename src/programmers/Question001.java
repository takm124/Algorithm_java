package programmers;

import java.util.*;

public class Question001 { // 숫자 카드 나누기
    public int solution(int[] arrA, int[] arrB) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int aMin = Arrays.stream(arrA).min().getAsInt();
        int bMin = Arrays.stream(arrB).min().getAsInt();

        //step1
        for (int i = 2; i <= aMin; i++) {
            if (aMin % i == 0) set.add(i);
        }

        for (int i = 2; i <= bMin; i++) {
            if (bMin % i == 0) set.add(i);
        }


        //step2
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;
            //조건 1
            for (int j = 0; j < arrA.length; j++) {
                if (arrA[j] % list.get(i) != 0 || arrB[j] % list.get(i) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer = Math.max(answer, list.get(i));

            flag = true;

            // 조건 2
            for (int j = 0; j < arrB.length; j++) {
                if (arrB[j] % list.get(i) != 0 || arrA[j] % list.get(i) == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) answer = Math.max(answer, list.get(i));
        }
        return answer;
    }

}
