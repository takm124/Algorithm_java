package inflearn.section9_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e; //start, end

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

public class Question2 { // 회의실 배정
    public static void main(String[] args) {
        Question2 T = new Question2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Time(s, e));
        }

        System.out.println(T.solution(arr, n));
    }

    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0; //end time
        for (Time time : arr) {
            if (time.s >= et) {
                et = time.e;
                cnt++;
            }
        }

        return cnt;
    }
}
