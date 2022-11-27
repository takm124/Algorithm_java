package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Question019 { // [카카오]캐시
    public int solution(int cacheSize, String[] cities) {
        int time = 0; //answer
        List<String> arr = new ArrayList<>();

        if (cacheSize == 0) return cities.length * 5;

        for (String city : cities) {
            city = city.toLowerCase();
            if (arr.contains(city)) {
                time++;
                arr.remove(city);
            } else {
                time += 5;
                if (arr.size() == cacheSize) {
                    arr.remove(arr.size() - 1);
                }
            }
            arr.add(0, city);
        }

        return time;
    }
}