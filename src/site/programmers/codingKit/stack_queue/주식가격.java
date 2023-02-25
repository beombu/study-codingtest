package site.programmers.codingKit.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> beforePrices = new LinkedList<>();//진행했던 가격들

        for (int i = 0; i < prices.length; i++) {
            int nowPrice = prices[i];

            //진행했던 가격들 반복
            for (int j = 0; j < beforePrices.size(); j++) {
                //가격이 크거나 같으면
                if(nowPrice >= beforePrices.peek()){
                    answer[j]++;
                }
                beforePrices.offer(beforePrices.poll());
            }

            beforePrices.offer(nowPrice);//가격 큐에 삽입
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 2, 3, 2, 3});

        for(int i : solution){
            System.out.print(i + " ");
        }
    }
}
