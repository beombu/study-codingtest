package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 뒤집은_소수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int x : arr) {
			StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
			int num = Integer.parseInt(sb.toString());

			if (isPrime(num)) {
				arrayList.add(num);
			}
		}

		for (Integer result : arrayList) {
			System.out.print(result + " ");
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
