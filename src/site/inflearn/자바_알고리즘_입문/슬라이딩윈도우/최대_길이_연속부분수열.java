package site.inflearn.자바_알고리즘_입문.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_길이_연속부분수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int left = 0;
		int max = Integer.MIN_VALUE;
		int count = 0;

		for (int right = 0; right < N; right++) {
			if (arr[right] == 0) {
				count++;
			}

			while (count > K) {
				if (arr[left] == 0) {
					count--;
				}
				left++;
			}

			max = Math.max(max, right - left + 1);
		}

		System.out.println(max);
	}
}
