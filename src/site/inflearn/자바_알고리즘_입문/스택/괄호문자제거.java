package site.inflearn.자바_알고리즘_입문.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
				flag = true;
				continue;
			}

			if (flag) { // 괄호가 열려있다면
				if (ch == ')') {
					stack.pop();

					if (stack.isEmpty()) {
						flag = true;
					}

					continue;
				}
			}

			if (stack.isEmpty()) {
				sb.append(ch);
			}
		}

		System.out.println(sb);
	}
}
