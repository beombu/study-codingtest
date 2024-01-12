package site.boj.문제집.알고리즘_기초.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의_추측 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[1000001];

		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i < Math.sqrt(1000000); i++) {
			if (prime[i] == true) {
				continue;
			}
			for (int j = i + i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

		boolean isCorrect = false;
		while (true) {
			int N = Integer.parseInt(br.readLine());

			if (N == 0) {
				break;
			}

			for (int i = 1; i <= N / 2 + 1; i += 2) {
				int primeNum1 = i;
				int primeNum2 = N - i;
				if (!prime[primeNum1] && !prime[primeNum2]) {
					sb.append(N).append(" = ").append(primeNum1).append(" + ").append(primeNum2).append("\n");
					isCorrect = true;
					break;
				}
			}

			if (!isCorrect) {
				sb.delete(0, sb.length());
				sb.append("Goldbach's conjecture is wrong.");
				break;
			}
		}

		System.out.println(sb);
	}
}
