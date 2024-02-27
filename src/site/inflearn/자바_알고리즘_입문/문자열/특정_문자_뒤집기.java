package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정_문자_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();

		int lt = 0;
		int rt = str.length() - 1;

		while (lt < rt) {
			while (!Character.isAlphabetic(arr[lt])) {
				lt++;
			}

			while (!Character.isAlphabetic(arr[rt])) {
				rt--;
			}

			char tmp = arr[lt];
			arr[lt] = arr[rt];
			arr[rt] = tmp;
			lt++;
			rt--;
		}

		System.out.println(String.valueOf(arr));
	}
}
