package site.book.array;

public class 삼각_달팽이 {
	public int[] solution(int n) {

		int[][] arr = new int[n][n];
		int v = 1;

		int x = 0;
		int y = 0;

		while (true) {

			while (true) {
				arr[y][x] = v++;
				if (y + 1 == n || arr[y + 1][x] != 0) {
					break;
				}
				y += 1;

			}
			if (x + 1 == n || arr[y][x + 1] != 0) {
				break;
			}
			x += 1;

			while (true) {
				arr[y][x] = v++;
				if (x + 1 == n || arr[y][x + 1] != 0) {
					break;
				}
				x += 1;
			}

			if (arr[y - 1][x - 1] != 0) {
				break;
			}
			x -= 1;
			y -= 1;

			while (true) {
				arr[y][x] = v++;
				if (arr[y - 1][x - 1] != 0) {
					break;
				}
				x -=1;
				y -= 1;
			}

			if (y + 1 == n || arr[y + 1][x] != 0) {
				break;
			}
			y += 1;
		}

		int[] answer = new int[v - 1];
		int index = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				answer[index++] = arr[i][j];
			}
		}

		return answer;
	}
}
