package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class 후위_표기식2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Double> hashMap = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();

		for (int i = 0; i < N; i++) {
			double num = Double.parseDouble(br.readLine());
			hashMap.put((char)(65 + i), num);
		}

		Stack<Double> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (hashMap.containsKey(ch)) {
				stack.push(hashMap.get(ch));
			} else {
				if (stack.size() < 2) {
					continue;
				}

				double result = operator(ch, stack.pop(), stack.pop());
				stack.push(result);
			}
		}

		System.out.printf("%.2f", stack.pop());
	}

	public static double operator(char ch, double first, double second) {
		double result = 0;

		switch (ch) {
			case '+':
				result = second + first;
				break;
			case '-':
				result = second - first;
				break;
			case '*':
				result = second * first;
				break;
			case '/':
				result = second / first;
				break;
		}

		return Math.round(result * 100) / 100.0;
	}
}
