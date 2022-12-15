package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else {//')'이면
                if(str.charAt(i - 1) == '('){//레이저이면
                    stack.pop();
                    result += stack.size();
                }else{
                    stack.pop();
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
