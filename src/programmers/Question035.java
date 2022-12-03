package programmers;

import java.util.HashMap;
import java.util.Map;

public class Question035 { // 오픈 채팅방
    public String[] solution(String[] record) {
        // "Enter Leave Change"
        Map<String, String> map = new HashMap<>();
        int cnt = 0; // 닉네임 변경 카운트

        for (String event : record) {
            String[] tmp = event.split(" "); // 동작, ID, NickName
            if (tmp[0].equals("Enter")) { // 입장
                map.put(tmp[1], tmp[2]);
            } else if (tmp[0].equals("Leave")) { //퇴장
                continue;
            } else { // 닉네임 변경
                map.put(tmp[1], tmp[2]);
                cnt++;
            }
        }

        String[] ans = new String[record.length - cnt];
        int idx = 0;
        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" "); // 동작, ID, NickName
            if (tmp[0].equals("Enter")) { // 입장
                ans[idx++] = map.get(tmp[1]) + "님이 들어왔습니다.";
            } else if (tmp[0].equals("Leave")) { //퇴장
                ans[idx++] = map.get(tmp[1]) + "님이 나갔습니다.";
            }
        }

        return ans;
    }

}
