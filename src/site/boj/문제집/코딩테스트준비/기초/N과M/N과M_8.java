package site.boj.문제집.코딩테스트준비.기초.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M_8 {
	private static int N, M;
	private static int[] arr;
	private static int[] printArr;
	private static boolean[] visited;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		printArr = new int[M];
		visited = new boolean[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		dfs(0, 0);
		System.out.println(sb);
	}

	public static void dfs(int depth, int beforeIdx) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(printArr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = beforeIdx; i < N; i++) {
			visited[i] = true;
			printArr[depth] = arr[i];
			dfs(depth + 1, i);
			visited[i] = false;
		}
	}
}
