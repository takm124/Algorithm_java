package inflearn.section9_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
class lecture implements Comparable<lecture> {
    public int pay;
    public int day;

    public lecture(int pay, int day) {
        this.pay = pay;
        this.day = day;
    }

    @Override
    public int compareTo(lecture o) {
        return o.day - this.day;
    }
}

public class Question4 { // 최대 수입 스케쥴(PriorityQueue 응용)
    static int max;
    public static void main(String[] args) {
        Question4 T = new Question4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int d = in.nextInt();
            arr.add(new lecture(p, d));
            if (d>max) max = d;
        }

        System.out.println(T.solution(arr));
    }

    public int solution(ArrayList<lecture> arr) {
        int ans = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 큰 숫자부터 정렬
        Collections.sort(arr); // day에 의해 내림차순 정렬
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < arr.size(); j++) {
                if (arr.get(j).day < i) break;
                pQ.offer(arr.get(j).pay);
            }
            if (!pQ.isEmpty()) ans += pQ.poll();
        }

        return ans;
    }
}
