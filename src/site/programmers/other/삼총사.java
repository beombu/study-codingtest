package site.programmers.other;

public class 삼총사 {
	public static int answer = 0;
	public static int count = 0;
	public static boolean[] visited;


	public int solution(int[] number) {
		visited = new boolean[number.length];
		dfs(number, 0);

		return answer;
	}

	public static void dfs(int[] number, int depth) {
		if (count == 3) {
			if (sum(number) == 0) {
				answer++;
			}

			return;
		} else if (depth == number.length) {
			return;
		} else {
			count++;
			visited[depth] = true;
			dfs(number, depth + 1);

			count--;
			visited[depth] = false;
			dfs(number, depth + 1);
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
