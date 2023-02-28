package site.programmers.codingKit.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 디스크_컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;

        //jobs배열을 요청시간 오름차순 정렬, 같으면 작업 소요시간 오름차순 정렬
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        //우선순의 큐를 작업 소요시간 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        return answer;
    }
}
