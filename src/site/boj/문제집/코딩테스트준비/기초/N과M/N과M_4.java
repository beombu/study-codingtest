package site.boj.문제집.코딩테스트준비.기초.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_4 {
	public static int N;
	public static int M;
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visited = new boolean[N];

		dfs(0, 0);
		System.out.println(sb);
	}

	public static void dfs(int depth, int beforeValue) {
		if (depth == M) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = beforeValue; i < N; i++) {
			visited[i] = true;
			arr[depth] = i + 1;
			dfs(depth + 1, i);
			visited[i] = false;
		}
	}
}
