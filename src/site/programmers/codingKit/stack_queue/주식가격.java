package site.programmers.codingKit.stack_queue;

import java.util.Stack;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> beforePrices = new Stack<>();//가격이 크거나 같으면 들어가는 스택

        for (int i = 0; i < prices.length; i++) {
            int nowPrice = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                if(j == prices.length - 1){//마지막 index라면
                    answer[i] = beforePrices.size() + 1;
                    beforePrices.clear();
                    break;
                }
                //가격이 크거나 같으면
                if (nowPrice <= prices[j]) {
                    beforePrices.push(prices[j]);
                }else {
                    answer[i] = beforePrices.size() + 1;
                    beforePrices.clear();
                    break;
                }
            }
        }
        return answer;
    }
}
