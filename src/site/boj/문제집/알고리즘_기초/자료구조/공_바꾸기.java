package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] bucket = new int[N];

		for (int i = 0; i < N; i++) {
			bucket[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int changedBucket1 = Integer.parseInt(st.nextToken()) - 1;
			int changedBucket2 = Integer.parseInt(st.nextToken()) - 1;

			int swap = bucket[changedBucket1];
			bucket[changedBucket1] = bucket[changedBucket2];
			bucket[changedBucket2] = swap;
		}

		for (int num : bucket) {
			sb.append(num).append(" ");
		}

		System.out.println(sb);
	}
}
