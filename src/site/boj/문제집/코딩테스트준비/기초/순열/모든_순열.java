package site.boj.문제집.코딩테스트준비.기초.순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모든_순열 {
	private static int N;
	private static int[] arr;
	private static int[] printArr;
	private static boolean[] visited;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		printArr = new int[N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}

		dfs(0);
		System.out.println(sb);
	}

	public static void dfs(int depth) {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				sb.append(printArr[i] + 1).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i]) {
				continue;
			}

			visited[i] = true;
			printArr[depth] = arr[i];
			dfs(depth + 1);
			visited[i] = false;
		}
	}
}
