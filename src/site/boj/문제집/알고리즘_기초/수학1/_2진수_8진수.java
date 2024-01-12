package site.boj.문제집.알고리즘_기초.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2진수_8진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		BigInteger N = new BigInteger(str, 2);

		String result = N.toString(8);

		System.out.println(result);
	}
}
