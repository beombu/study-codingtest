package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                if(stack.isEmpty()){
                    sb.append(ch);
                }
            }
        }

        System.out.println(sb);
    }
}
