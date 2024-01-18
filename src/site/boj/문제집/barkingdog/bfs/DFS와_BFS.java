package site.boj.문제집.barkingdog.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와_BFS {
	private static int N;//정점 개수
	private static int M;//간선 개수
	private static int k;//시작 정점
	private static int[][] boards;
	private static boolean[] visited;
	private static StringBuilder sb = new StringBuilder();
	private static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		boards = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			boards[a][b] = boards[b][a] = 1;
		}

		dfs(k);
		sb.append("\n");
		visited = new boolean[N + 1];

		bfs(k);
		System.out.println(sb);
	}

	public static void dfs(int start) {
		visited[start] = true;
		sb.append(start + " ");

		for (int i = 0; i <= N; i++) {
			if (boards[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}

	public static void bfs(int start) {
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			start = queue.poll();
			sb.append(start + " ");

			for (int i = 1; i <= N; i++) {
				if (boards[start][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
