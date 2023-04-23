package leetcode_easy;

public class Reverse_Words_in_a_String_III_557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i< arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) {
                sb.append(arr[i].charAt(j));
            }
            arr[i] = sb.reverse().toString();
        }

        return String.join(" ", arr);
    }
}
