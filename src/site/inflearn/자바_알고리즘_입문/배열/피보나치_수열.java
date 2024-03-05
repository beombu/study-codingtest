package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수열 {
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];

		fibonacci(N);

		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int fibonacci(int N) {
		//이미 존재하면 메모이제이션
		if (arr[N] > 0) {
			return arr[N];
		}

		if (N == 1 || N == 2) {
			arr[N] = 1;
			return arr[N];
		} else {
			arr[N] = fibonacci(N - 1) + fibonacci(N - 2);
			return arr[N];
		}
	}
}
