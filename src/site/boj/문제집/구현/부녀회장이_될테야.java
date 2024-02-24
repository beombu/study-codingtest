package site.boj.문제집.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이_될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[15][15];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 14; i++) {
			arr[0][i] = i;
		}

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
			}
		}

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(arr[k][n] + "\n");  //k층 n호에 있는 사람 수 출력
		}

		System.out.print(sb);
	}
}
