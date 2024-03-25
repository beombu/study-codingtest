package site.inflearn.자바_알고리즘_입문.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 크레인_인형뽑기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<Queue<Integer>> board = new ArrayList<>();
		Stack<Integer> bucket = new Stack<>();
		int result = 0;

		for (int i = 0; i < N; i++) {
			board.add(new LinkedList<>());
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				int doll = Integer.parseInt(st.nextToken());

				if (doll == 0) {
					continue;
				}

				board.get(j).add(doll);
			}
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int move = Integer.parseInt(st.nextToken());

			Integer getDoll = board.get(move - 1).poll();

			if (bucket.isEmpty()) {
				bucket.push(getDoll);
				continue;
			}

			if (Objects.equals(bucket.peek(), getDoll)) {
				bucket.pop();
				result += 2;
			} else {
				bucket.push(getDoll);
			}
		}

		System.out.println(result);
	}
}
