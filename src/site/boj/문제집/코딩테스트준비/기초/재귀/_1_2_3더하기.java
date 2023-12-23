package site.boj.문제집.코딩테스트준비.기초.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_2_3더하기 {
	private static int[] arr = new int[11];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp(n));
		}
	}

	public static int dp(int num) {
		if (num < 0) {
			return 0;
		}

		if (num == 0 || num == 1) {
			return 1;
		}

		if (arr[num] == 0) {
			arr[num] = dp(num - 1) + dp(num - 2) + dp(num - 3);
		}

		return arr[num];
	}
}
