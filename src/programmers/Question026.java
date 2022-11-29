package programmers;

import java.util.ArrayList;
import java.util.Collections;


public class Question026 { // 뉴스 클러스터링
    public static void main(String[] args) {
        System.out.println(solution("aa1+aa2", "AAAA12"));
    }

    public static int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (!Character.isAlphabetic(str1.charAt(i)) || !Character.isAlphabetic(str1.charAt(i+1))) continue;
            StringBuilder sb = new StringBuilder();
            sb.append(str1.charAt(i));
            sb.append(str1.charAt(i+1));
            arr1.add(sb.toString());
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            if (!Character.isAlphabetic(str2.charAt(i)) || !Character.isAlphabetic(str2.charAt(i+1))) continue;
            StringBuilder sb = new StringBuilder();
            sb.append(str2.charAt(i));
            sb.append(str2.charAt(i+1));
            arr2.add(sb.toString());
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        for(String s : arr1){
            if(arr2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }

        for(String s : arr2){
            union.add(s);
        }

        double jakard = 0;

        if(union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double)intersection.size() / (double)union.size();
        }

        return (int)(jakard * 65536);

    }
}