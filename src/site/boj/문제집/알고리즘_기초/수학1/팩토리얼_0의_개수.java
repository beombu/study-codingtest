package site.boj.문제집.알고리즘_기초.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼_0의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		BigInteger result = new BigInteger("1");

		for (int i = 1; i <= N; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		String str = String.valueOf(result);

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) - '0' == 0) {
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(cnt);
	}
}
