package site.boj.문제집.코딩테스트준비.기초.순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 차이를_최대로 {
	private static int N;
	private static int[] arr;
	private static int[] printArr;
	private static boolean[] visited;
	private static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		printArr = new int[N];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0);
		System.out.println(result);
	}

	public static void dfs(int depth) {
		if (depth == N) {
			int sum = 0;

			for (int i = 0; i < N - 1; i++) {
				sum += Math.abs(printArr[i] - printArr[i + 1]);
			}
			result = Math.max(result, sum);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				printArr[depth] = arr[i];
				visited[i] = true;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
