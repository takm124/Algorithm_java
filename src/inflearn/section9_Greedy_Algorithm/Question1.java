package inflearn.section9_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int height;
    public int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height; // 내림차순
        //o.height - this.height;  오름차순
    }
}

public class Question1 { // 씨름 선수
    public static void main(String[] args) {
        Question1 T = new Question1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = in.nextInt();
            int w = in.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println(T.solution(arr, n));
    }

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); // 내림차순 정렬
        int max = Integer.MIN_VALUE;
        for (Body body : arr) {
            if (body.weight > max) {
                max = body.weight;
                cnt++;
            }
        }

        return cnt;
    }
}
