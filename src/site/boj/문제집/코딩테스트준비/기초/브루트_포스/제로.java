package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}

		int result = stack.stream().mapToInt(i -> i).sum();

		System.out.println(result);
	}
}
