package leetcode_medium;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans, 0, 0, "", n);
        return ans;
    }

    public void dfs(List<String> ans, int open, int close, String s, int n) {
        if (s.length()== n*2) {
            ans.add(s);
            return;
        }

        //무조건 여는 소괄호가 먼저 나와야함
        if (open < n) {
            dfs(ans, open+1, close, s + "(", n);
        }

        //닫는 소괄호의 개수가 여는 소괄호보다 작을때만 온전한 괄호의 모양을 유지할 수 있다.
        if (close < open) {
            dfs(ans, open, close+1, s + ")", n);
        }
    }
}
