package site.inflearn.자바_알고리즘_입문.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 공통원소_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] firstArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			firstArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(firstArr);

		int M = Integer.parseInt(br.readLine());
		int[] secondArr = new int[M];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			secondArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(secondArr);

		int firstIndex = 0;
		int secondIndex = 0;
		List<Integer> result = new ArrayList<>();

		while (firstIndex < N && secondIndex < M) {
			int firstValue = firstArr[firstIndex];
			int secondValue = secondArr[secondIndex];

			if (firstValue == secondValue) {
				result.add(firstValue);
				firstIndex++;
				secondIndex++;
			} else if (firstValue > secondValue) {
				secondIndex++;
			} else if (firstValue < secondValue) {
				firstIndex++;
			}
		}

		for (int x : result) {
			System.out.print(x + " ");
		}
	}
}
