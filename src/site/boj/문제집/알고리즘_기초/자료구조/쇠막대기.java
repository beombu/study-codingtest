package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    static char[] arr;
    static int piece = 0;
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char now = arr[i];
            if (now == '(') {
                stack.push(now);
            }else {
                if (arr[i - 1] == '(') {
                    stack.pop();
                    piece += stack.size();
                }else{
                    piece++;
                    stack.pop();
                }
            }
        }

        System.out.println(piece);
    }
}
