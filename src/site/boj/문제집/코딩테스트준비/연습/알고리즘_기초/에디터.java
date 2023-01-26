package site.boj.문제집.코딩테스트준비.연습.알고리즘_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 에디터 {
    static Stack<Character> leftStack = new Stack<>();
    static Stack<Character> rightStack = new Stack<>();
    static String str = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        str = br.readLine();
        for (Character c : str.toCharArray()) {
            leftStack.push(c);
        }

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("L")){
                moveLeft();
            }else if (command.equals("D")){
                moveRight();
            }else if (command.equals("B")){
                deleteStr();
            }else if (command.equals("P")){
                String s = st.nextToken();
                AddStr(s.charAt(0));
            }
        }

        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }

    private static void moveLeft() {
        if(!leftStack.empty()) rightStack.push(leftStack.pop());
    }

    private static void moveRight() {
        if(!rightStack.empty()) leftStack.push(rightStack.pop());
    }

    private static void deleteStr() {
        if(!leftStack.empty()) leftStack.pop();
    }

    private static void AddStr(char ch) {
        leftStack.push(ch);
    }
}
