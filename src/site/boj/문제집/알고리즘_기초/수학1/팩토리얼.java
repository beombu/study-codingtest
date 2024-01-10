package site.boj.문제집.알고리즘_기초.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 1;

		for (int i = N; i > 0; i--) {
			result *= i;
		}

		System.out.println(result);
	}
}
