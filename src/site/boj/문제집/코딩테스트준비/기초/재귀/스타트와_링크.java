package site.boj.문제집.코딩테스트준비.기초.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와_링크 {
	private static int N;
	private static int[][] boards;
	private static boolean[] visited;
	private static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		boards = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				boards[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0, 0);
		System.out.println(min);
	}

	public static void dfs(int idx, int count) {
		if (count == N / 2) {
			diff();
			return;
		}

		for (int i = idx; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i + 1, count + 1);
				visited[i] = false;
			}
		}
	}

	public static void diff() {
		int teamStart = 0;
		int teamLink = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visited[i] == true && visited[j] == true) {
					teamStart += boards[i][j];
					teamStart += boards[j][i];
				} else if (visited[i] == false && visited[j] == false) {
					teamLink += boards[i][j];
					teamLink += boards[j][i];
				}
			}
		}

		int val = Math.abs(teamStart - teamLink);

		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}

		min = Math.min(val, min);
	}
}
