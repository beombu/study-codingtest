package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판_최대합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		int result = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			int num1 = 0;
			int num2 = 0;

			for (int j = 0; j < N; j++) {//가로 합
				num1 += arr[i][j];
				num2 += arr[j][i];
			}

			result = Math.max(result, num1);
			result = Math.max(result, num2);
		}

		for (int i = 0; i < N; i++) {
			int num = arr[i][i];

			result = Math.max(result, num);
		}

		System.out.println(result);
	}
}
