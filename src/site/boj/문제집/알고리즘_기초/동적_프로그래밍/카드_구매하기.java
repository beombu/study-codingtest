package site.boj.문제집.알고리즘_기초.동적_프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드_구매하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] map = new int[N + 1];//N개의 카드백을 사기 위한 비용
		int[] dp = new int[N + 1];//N개의 카드팩을 사기 위한 최대 비용
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}

		//dp[i - j] + map[j] => i - j개 구하는 최대가격에서 j개를 사기 위한 비용을 더한다.

		dp[0] = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] + map[j]);
			}
		}

		System.out.println(dp[N]);
	}
}
