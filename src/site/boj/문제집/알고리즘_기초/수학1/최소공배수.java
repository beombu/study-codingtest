package site.boj.문제집.알고리즘_기초.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			int D = gcd(A, B);

			sb.append(A * B / D).append("\n");
		}

		System.out.println(sb);
	}

	//유클리드 호제법
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;

			a = b;
			b = r;
		}

		return a;
	}
}
