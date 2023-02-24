package site.programmers.codingKit.stack_queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        Queue<Pair> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int order = 1;

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Pair(priorities[i], i));
            pq.offer(priorities[i]);
        }

        while (!queue.isEmpty()){
            if (queue.peek().value == pq.peek()) {
                if(queue.peek().index == location){
                    return order;
                }
                pq.poll();
                queue.poll();
                order++;
            }else{
                queue.add(queue.poll());
            }
        }

        return order;
    }

    class Pair{
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}