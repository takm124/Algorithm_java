package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Question038 { // 연속 부분수열의 합
    public int solution(int[] elements) {
        int[] newArr = new int[elements.length * 2];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            newArr[i] = newArr[i + elements.length] = elements[i]; // 배열의 한도가 넘어갔을 땐 어떡하지
        }

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                set.add(Arrays.stream(newArr, j, j + i).sum());
            }
        }

        return set.size();
    }

    public int solution2(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i=1; i<=elements.length; i++) {
            for (int j=0; j<elements.length; j++) {
                int sum = 0;
                for (int k=j; k<j+i; k++) {
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }

        return set.size();
    }

}
