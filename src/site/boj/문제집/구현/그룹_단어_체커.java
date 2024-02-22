package site.boj.문제집.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 그룹_단어_체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = N;

		for (int i = 0; i < N; i++) {
			Stack<Character> queue = new Stack<>();

			String word = br.readLine();
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);

				if (!queue.contains(ch)) {
					queue.add(ch);
				} else if (queue.contains(ch) && queue.peek() != ch) {
					result--;
					break;
				}
			}
		}

		System.out.println(result);
	}
}
