package programmers;


public class Question033 { // 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int ans = 0;
        for (String skill_tree : skill_trees) {
            String s = skill_tree;

            for (int i = 0; i < skill_tree.length(); i++) {
                String tmp = skill_tree.substring(i, i+1);
                if (!skill.contains(tmp)) {
                    s = s.replace(tmp, "");
                }
            }

            if (skill.indexOf(s) == 0) ans++;

        }

        return ans;
    }
}
