package programmers;

import java.util.Arrays;

public class Question013 { // 구명보트
    public int solution(int[] people, int limit) {
        int lp = 0, rp = people.length -1;
        int cnt = 0;
        Arrays.sort(people);

        while (lp <= rp) {
            if (people[lp] + people[rp] <= limit) {
                lp++;
            }
            rp--;
            cnt++;
        }
        return cnt;
    }
}
