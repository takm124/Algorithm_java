package leetcode_easy;

public class Detect_Capital_520 {
    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        int uc = 0;

        for (int i= 0; i<word.length(); i++) {
            if (Character.isUpperCase(arr[i])) {
                uc++;
            }
        }

        if (uc == 0 || uc == word.length()) return true;
        return uc == 1 && Character.isUpperCase(arr[0]);
    }
}
