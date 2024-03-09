package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 임시반장_정하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N + 1][6];
		int result = Integer.MIN_VALUE;
		int student = 0;

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= N; i++) { //i번째 학생
			int count = 0;
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}

			if (result < count) {
				result = count;
				student = i;
			}
		}

		System.out.println(student);
	}
}
