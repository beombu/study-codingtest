package site.inflearn.자바_알고리즘_입문.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대매출 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N - K + 1; i++) {
			int value = 0;

			for (int j = i; j < i + K; j++) {
				value += arr[j];
			}

			max = Math.max(max, value);
		}

		System.out.println(max);
	}
}
