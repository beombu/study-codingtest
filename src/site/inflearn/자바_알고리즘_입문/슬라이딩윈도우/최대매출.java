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

		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		int lt = 0;
		int rt = K;
		int temp = 0;

		for (int i = 0; i < K; i++) {
			temp += arr[i];
		}

		while (rt < N) {
			if (temp > max) {
				max = temp;
			}

			temp = temp + arr[rt] - arr[lt];

			rt++;
			lt++;

		}

		System.out.println(max);
	}
}
