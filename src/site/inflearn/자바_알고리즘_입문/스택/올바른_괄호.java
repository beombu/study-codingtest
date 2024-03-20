package site.inflearn.자바_알고리즘_입문.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른_괄호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		String result = "YES";

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (a == '(') {
				stack.push(a);
			} else {
				if (stack.isEmpty()) {
					result = "NO";
					break;
				}

				stack.pop();
			}
		}

		if (!stack.isEmpty()) {
			result = "NO";
		}

		System.out.println(result);
	}
}
