package site.programmers.codingKit.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    static Queue<Integer> queue = new LinkedList<>();
    static ArrayList<Integer> list = new ArrayList<>();

    public static int[] solution(int[] progresses, int[] speeds) {

        for (int i = 0; i < progresses.length; i++) {
            double remainingDay = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remainingDay);


            if (!queue.isEmpty() && queue.peek() < date){
                list.add(queue.size());
                queue.clear();
            }

            queue.offer(date);
        }

        list.add(queue.size());

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
