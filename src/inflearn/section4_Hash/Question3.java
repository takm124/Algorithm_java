package inflearn.section4_Hash;

import java.util.*;

public class Question3 { // 매출액의 종류
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }

        for (Integer integer : solution(arr, n1, n2)) {
            System.out.print(integer + " ");
        }

    }

    private static List<Integer> solution(int[] arr, int n1, int n2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n2; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ans.add(map.size());

        for (int i = n2; i < n1; i++) {
            map.put(arr[i - n2], map.get(arr[i - n2]) - 1);
            if (map.get(arr[i - n2]) == 0) map.remove(arr[i - n2]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans.add(map.size());
        }

        return ans;
   }
}
