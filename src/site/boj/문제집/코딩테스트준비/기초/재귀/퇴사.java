package site.boj.문제집.코딩테스트준비.기초.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사 {
	private static int N;
	private static int[][] schedule;
	private static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		schedule = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			schedule[i][0] = Integer.parseInt(st.nextToken());
			schedule[i][1] = Integer.parseInt(st.nextToken());
		}

		result = 0;
		dfs(0, 0);

		System.out.println(result);
	}

	public static void dfs(int depth, int pay) {
		if (depth >= N) {
			result = Math.max(pay, result);
			return;
		}

		if (depth + schedule[depth][0] <= N) {
			dfs(depth + schedule[depth][0], pay + schedule[depth][1]);
		} else {
			dfs(depth + schedule[depth][0], pay);
		}

		dfs(depth + 1, pay);
	}
}
