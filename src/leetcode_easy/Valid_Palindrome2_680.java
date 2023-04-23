package leetcode_easy;

public class Valid_Palindrome2_680 {
    public boolean validPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return isPalindrome(s, p1 + 1, p2) || isPalindrome(s, p1, p2 - 1);
            } else {
                p1++;
                p2--;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int p1, int p2) {
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            } else {
                p1++;
                p2--;
            }
        }
        return true;
    }
}
