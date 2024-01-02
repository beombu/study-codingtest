package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			if (!Character.isLetter(c)) {
				sb.append(c);
				continue;
			}

			int n = (int)c + 13;

			if (Character.isUpperCase(c) && n > 90) {
				n -= 26;
			}

			if (Character.isLowerCase(c) && n > 122) {
				n -= 26;
			}

			sb.append((char)n);
		}

		System.out.println(sb);
	}
}
