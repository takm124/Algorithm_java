package programmers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question021 { // 튜플
    public int[] solution(String s) {
        s = s.replaceAll("[\\{,\\}]", " "); // { , } 특수문자 제거 (쉼표 포함)
        String[] sa = s.split("[ ]+"); // 공백 제거를 1회이상 반복

        Map<String, Integer> map = new HashMap<>();
        for (String key : sa) {
            if (!key.equals("")) {
                map.put(key, (map.getOrDefault(key, 0) + 1));
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());}); // 내림차순 정리

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i).getKey());
        }

        return answer;
    }

    public int[] solution2(String s) {

        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        return answer;
    }

}