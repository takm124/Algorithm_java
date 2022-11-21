package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Question002 {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }

        int min = Arrays.stream(iArr).min().getAsInt();
        int max = Arrays.stream(iArr).max().getAsInt();

        answer = min + " " + max;

        return answer;
    }
}
