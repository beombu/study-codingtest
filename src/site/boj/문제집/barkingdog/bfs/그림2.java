package site.boj.문제집.barkingdog.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림2 {
	private static int n;//도화지 새로 크기
	private static int m;//도화지 가로 크기
	private static int[] dx = {-1, 1, 0, 0};
	private static int[] dy = {0, 0, -1, 1};
	private static int[][] arr;
	private static boolean[][] visited;
	private static int count = 0;
	private static int max = 0;
	private static int width = 0;
	private static Queue<Pair> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (arr[i][j] == 0 || visited[i][j]) {
					continue;
				}

				count++;
				queue.offer(new Pair(i, j));
				visited[i][j] = true;
				width = 0;

				while (!queue.isEmpty()) {
					Pair pair = queue.poll();
					width++;
					for (int k = 0; k < 4; k++) {
						int n_x = pair.x + dx[k];
						int n_y = pair.y + dy[k];

						if (n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) {
							continue;
						}
						if (arr[n_x][n_y] == 1 && !visited[n_x][n_y]) {//그림이 있고 방문하지 않았다면
							queue.offer(new Pair(n_x, n_y));
							visited[n_x][n_y] = true;

						}
					}
				}

				if (width > max) {
					max = width;
				}
			}
		}

		System.out.println(count);
		System.out.println(max);
	}

	public static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}
}
