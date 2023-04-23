package leetcode_easy;

public class Delete_Characters_to_Make_Fancy_String_1957 {
    public String makeFancyString(String s) {
        int count = 1;
        char c = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append (s.charAt (0));

        for (int i = 1; i < s.length (); i++) {
            if (s.charAt (i) == c) {
                count++;
            } else {
                c = s.charAt (i);
                count = 1;
            }

            if (count < 3) {
                sb.append (s.charAt (i));
            }
        }

        return sb.toString ();
    }
}
