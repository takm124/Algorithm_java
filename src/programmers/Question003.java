package programmers;

import java.util.*;

public class Question003 { // JadenCase 문자열 만들기
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        List<String> list = new ArrayList<>();

        for (String st : sArr) {
            String tmp = "";
            for (int i = 0; i < st.length(); i++) {
                if (i == 0) {
                    if (st.charAt(i) >= 97 && st.charAt(i) <= 122) {
                        tmp += (char) (st.charAt(i) - 32);
                    } else {
                        tmp += (char) (st.charAt(i));
                    }
                } else {
                    if (st.charAt(i) >= 65 && st.charAt(i) <= 90) {
                        tmp += (char) (st.charAt(i) + 32);
                    } else {
                        tmp += (char) (st.charAt(i));
                    }
                }
            }
            list.add(tmp);
        }

        answer = String.join(" ", list);

        if (s.charAt(s.length() - 1) == ' ') {
            answer += " ";
        }

        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

}
