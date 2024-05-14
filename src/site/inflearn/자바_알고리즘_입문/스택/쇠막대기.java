package site.inflearn.자바_알고리즘_입문.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int result = solution(str.toCharArray());
		System.out.println(result);
	}

	private static int solution(char[] charArray) {
		Stack<Character> stack = new Stack<>();//쇠막대기를 찾는 용도
		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				stack.push('(');
			} else { // ')'인 경우
				stack.pop();

				if (charArray[i - 1] == '(') { //레이저인 경우
					count += stack.size();
				} else { //쇠 막대기인 경우
					count++;
				}
			}
		}

		return count;
	}
}
