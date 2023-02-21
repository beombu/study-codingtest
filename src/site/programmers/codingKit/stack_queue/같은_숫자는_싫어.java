package site.programmers.codingKit.stack_queue;

import java.util.ArrayList;
import java.util.Stack;

public class 같은_숫자는_싫어 {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();

    public int[] solution(int[] arr) {
        for(int i : arr){
            if(!stack.isEmpty()){
                if(stack.peek() == i){
                    stack.pop();
                }else{
                    list.add(stack.pop());
                }
            }
            stack.push(i);
        }

        list.add(stack.pop());

        return list.stream().mapToInt(i -> i).toArray();
    }
}
