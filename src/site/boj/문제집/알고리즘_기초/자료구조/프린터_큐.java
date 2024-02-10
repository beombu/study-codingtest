package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int resultIndex = Integer.parseInt(st.nextToken());

			Queue<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}

			int cnt = 0;

			while (true) {
				int[] cur = queue.poll();
				boolean isMax = true;

				for (int[] curQueue : queue) {
					if (curQueue[1] > cur[1]) {
						isMax = false;
						break;
					}
				}

				if (isMax) {
					cnt++;
					if (cur[0] == resultIndex) {
						break;
					}
				} else {
					queue.add(cur);
				}
			}

			System.out.println(cnt);
		}

	}
}
