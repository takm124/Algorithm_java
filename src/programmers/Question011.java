package programmers;

import java.util.ArrayList;

public class Question011 { // 영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] ans = {0, 0};
        ArrayList<String> arr = new ArrayList<>();

        arr.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if(words[i].length()<=1){ //글자 수가 1이하일때
                ans[0]=i%n+1;
                ans[1]=i/n+1;
                return ans;
            }

            int bLen = words[i-1].length(); // 직전에 말한 단어의 길이
            if (arr.contains(words[i]) || words[i-1].charAt(bLen - 1) != words[i].charAt(0)) { // 이미 말한 단어
                ans[0] = (i%n) + 1 == 0 ? n : (i%n) + 1;
                ans[1] = (i/n) + 1;
                break;
            }

            arr.add(words[i]);
        }
        return ans;
    }
}
