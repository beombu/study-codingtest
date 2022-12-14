package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식_연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch)){
                stack.push(ch - 48);
            }else{
                int tmp = 0;
                int rightNum = stack.pop();
                int leftNum = stack.pop();

                switch (ch){
                    case '+':
                        tmp = leftNum + rightNum;
                        break;
                    case '-':
                        tmp = leftNum - rightNum;
                        break;
                    case '*':
                        tmp = leftNum * rightNum;
                        break;
                    case '/':
                        tmp = leftNum / rightNum;
                        break;
                }
                stack.push(tmp);
            }
        }

        System.out.println(stack.get(0));
    }
}
