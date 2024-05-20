package site.programmers.other;

public class 삼총사 {
	public static int count = 0;
	public static boolean[] visited;


	public int solution(int[] number) {
		int answer = 0;
		visited = new boolean[number.length];
		dfs(number, number.length, 0, 3); //nCr
		answer = count;
		return answer;
	}

	public static void dfs(int[] number, int n, int start, int r) {
		if (r == 0) {
			if (sum(number) == 0) {
				count++;
			}

			return;
		}

		for (int i = start; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(number, n, i, r - 1);
				visited[i] = false;
			}
		}

	}

	public static int sum(int[] number) {
		int sum = 0;

		for (int i = 0; i < number.length; i++) {
			if (visited[i] == true) {
				sum += number[i];
			}
		}

		return sum;
	}
}
