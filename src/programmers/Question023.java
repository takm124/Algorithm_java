package programmers;

import java.util.*;

public class Question023 { // 기능개발
    public int[] solution(int[] pg, int[] sp) {
        List<Integer> arr = new ArrayList<>();

        int index = 0;
        while (index < pg.length) {
            int cnt = 0;
            if (pg[index] >= 100) { // 선두가 100이 넘었을 때
                cnt++;
                index++;
                for (int i = index; i < pg.length; i++) { // 다음 index 체크
                    if (pg[i] >= 100) {
                        cnt++;
                        index++;
                    } else {
                        break;
                    }
                }

                for (int i = index; i < pg.length; i++) {
                    pg[i] += sp[i];
                }

            } else { // 선두 아직 100 아님
                for (int i = index; i < pg.length; i++) {
                    pg[i] += sp[i];
                }
            }

            if (cnt != 0) arr.add(cnt);
        }


        int[] ans = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return ans;
    }
}