package site.boj.문제집.barkingdog.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림 {
	private static Queue<Pair> queue = new LinkedList<>();
	private static int[][] boards;
	private static boolean[][] visited;
	private static int[] dx = {-1, 1, 0, 0};//상, 하, 좌, 우
	private static int[] dy = {0, 0, -1, 1};
	private static int n;
	private static int m;
	private static int count = 0;
	private static int width = 0;
	private static int max = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		boards = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				boards[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				//0이거나 방문한적이 있다면 생략
				if (boards[i][j] == 0 || visited[i][j]) {
					continue;
				}

				count++;//1이고, 방문을 하지 않았기 때문에 시작점이 되니까 +1
				queue.offer(new Pair(i, j));//큐에 좌표 삽입
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
						if (boards[n_x][n_y] == 1 && !visited[n_x][n_y]) {
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

		public int getY() {
			return y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}

	}
}
