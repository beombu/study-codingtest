package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 멘토링 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		int[][] arr = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= N; j++) {
				int cnt = 0;

				for (int k = 0; k < M; k++) {
					int mentor = 0;
					int mentee = 0;

					for (int s = 0; s < N; s++) {
						if (arr[k][s] == i) {
							mentor = s;
						}

						if (arr[k][s] == j) {
							mentee = s;
						}
					}

					if (mentor > mentee) {
						cnt++;
					}
				}

				if (cnt == M) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
