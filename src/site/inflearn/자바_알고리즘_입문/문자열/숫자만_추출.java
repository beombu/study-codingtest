package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				sb.append(ch);
			}
		}

		System.out.println(Integer.parseInt(sb.toString()));
	}
}
