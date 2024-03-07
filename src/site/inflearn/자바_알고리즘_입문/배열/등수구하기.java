package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 등수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int score = Integer.parseInt(st.nextToken());
			arr[i] = score;
		}

		int[] retArr = new int[N];

		for (int i = 0; i < N; i++) {
			int count = 1;

			for (int j = 0; j < N; j++) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}

			retArr[i] = count;
		}

		for (int a : retArr) {
			System.out.print(a + " ");
		}
	}
}
