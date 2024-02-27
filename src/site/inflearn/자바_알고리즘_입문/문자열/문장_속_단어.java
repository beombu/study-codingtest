package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장_속_단어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] arr = str.split(" ");
		String result = "";

		for (String s : arr) {
			if (result.length() < s.length()) {
				result = s;
			}
		}

		System.out.println(result);
	}
}
