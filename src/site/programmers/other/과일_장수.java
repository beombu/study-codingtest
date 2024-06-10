package site.programmers.other;

import java.util.Arrays;
import java.util.Comparator;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            count++;

            if (count == m) {
                answer += arr[i] * m;
                count = 0;
            }
        }

        return answer;
    }
}
