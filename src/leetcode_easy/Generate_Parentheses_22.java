package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recur(ans, "(", n-1, n); // answer, start, open, end

        return ans;
    }

    public void recur(List<String> ans, String result, int open, int end) {
        if (open == 0 && end == 0) {
            ans.add(result);
            return;
        }

        if (end > open) {
            recur(ans, result += ')', open, end-1);
        }

        if (open > 0) {
            recur(ans, result += '(', open-1, end);
        }
    }

}
