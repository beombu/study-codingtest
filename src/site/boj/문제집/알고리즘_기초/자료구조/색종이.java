package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int paperNumber = Integer.parseInt(br.readLine());
		int result = 100 * paperNumber;
		int[][] paper = new int[101][101];

		for (int i = 0; i < paperNumber; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					paper[j][k]++;
				}
			}
		}

		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if (paper[i][j] > 1) {
					result -= paper[i][j];
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
