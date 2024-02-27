package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();

		String result = "YES";

		int lt = 0;
		int rt = str.length() - 1;

		while (lt < rt) {
			if (str.charAt(lt) != str.charAt(rt)) {
				result = "NO";
				break;
			}

			lt++;
			rt--;
		}

		System.out.println(result);
	}
}
