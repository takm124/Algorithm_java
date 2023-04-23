package leetcode_medium;

public class Longest_Palindromic_Substring_5 {
    int IDX, MAX;

    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        for (int i = 0; i < s.length()-1; i++) {
            checkPalindrome(s, i, i); // 홀수인 경우
            checkPalindrome(s, i, i+1); // 짝수인 경우
        }

        return s.substring(IDX, IDX + MAX);
    }

    public void checkPalindrome(String s, int lt, int rt) {
        while (lt >= 0 && rt < s.length() && s.charAt(lt) == s.charAt(rt)) { // 팔린드롬을 만족할 때
            lt--;
            rt++;
        }

        /**
         *  while문을 빠져나온 직후의 lt와 rt 값에 해당하는 String은 팔린드롬을 만족하지 않음
         *  직전의 lt, rt 값이 팔린드롬을 만족한다.
         */

        if (MAX < rt - lt - 1) { // rt -lt - 1 = 팔린드롬을 만족하는 길이, 이 값이 MAX보다 클 경우 갱신 필요
            IDX = lt + 1; // 직전의 lt 값 설정
            MAX = rt - lt - 1;  // 팔린드롬 길이
        }
    }
}
