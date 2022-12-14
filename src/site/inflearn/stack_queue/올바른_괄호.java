package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String result = "YES";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            result = "NO";
        }

        System.out.println(result);
    }
}
