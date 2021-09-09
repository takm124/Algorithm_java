package leetcode;

public class Split_a_String_in_Balanced_Strings_1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int sum = 0;

        for (char c : s.toCharArray()) {
            sum += (c == 'R') ? 1 : -1;
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }
}
