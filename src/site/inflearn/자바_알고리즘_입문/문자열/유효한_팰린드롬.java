package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
		String result = "NO";

		String rs = new StringBuilder(s).reverse().toString();
		if (s.equals(rs)) {
			result = "YES";
		}

		System.out.println(result);
	}
}
