package site.programmers.codingKit.stack_queue;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int nowPrice = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;

                if(nowPrice > prices[j]){
                    break;
                }
            }
        }
        return answer;
    }
}
