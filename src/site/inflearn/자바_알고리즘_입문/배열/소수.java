package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
	private static boolean[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new boolean[N + 1];
		int cnt = 0;

		makePrime(N);

		for (int i = 1; i <= N; i++) {
			if (arr[i] == false) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	public static void makePrime(int N) {
		if (N < 2) {
			return;
		}

		arr[0] = arr[1] = true;

		for (int i = 2; i < Math.sqrt(N); i++) {
			if (arr[i] == true) {
				continue;
			}

			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
			}
		}
	}
}
