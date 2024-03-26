package site.inflearn.자바_알고리즘_입문.스택;

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

			if (Character.isDigit(ch)) {
				stack.push(Integer.parseInt(String.valueOf(ch)));
			} else {
				Integer num1 = stack.pop();
				Integer num2 = stack.pop();
				int tmp = 0;

				switch (ch) {
					case '+':
						tmp = num2 + num1;
						break;
					case '-':
						tmp = num2 - num1;
						break;
					case '*':
						tmp = num2 * num1;
						break;
					case '/':
						tmp = num2 / num1;
						break;
				}

				stack.push(tmp);
			}
		}

		System.out.println(stack.pop());
	}
}
