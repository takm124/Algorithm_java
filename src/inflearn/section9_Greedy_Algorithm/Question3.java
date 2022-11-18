package inflearn.section9_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {
    public int time;
    public char state;

    public Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time2 o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class Question3 { // 결혼식
    public static void main(String[] args) {
        Question3 T = new Question3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Time2(s, 's'));
            arr.add(new Time2(e, 'e'));
        }

        System.out.println(T.solution(arr, n));
    }

    public int solution(ArrayList<Time2> arr, int n) {
        int ans = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(arr);
        for (Time2 ob : arr) {
            if (ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }

            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
