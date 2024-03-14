package site.inflearn.자바_알고리즘_입문.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된_자연수의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		int left = 1;
		int right = 1;
		int sum = 0;

		while (left < N) {
			if (sum >= N) {
				sum -= left++;
			} else if (right == N) {
				break;
			} else if (sum < N) {
				sum += right++;
			}

			if (sum == N) {
				count++;
			}
		}

		System.out.println(count);
	}
}
