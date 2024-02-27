package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();

			sb.append(str).reverse();
			System.out.println(sb);
		}
	}
}
