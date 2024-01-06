package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사_배열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String[] arr = new String[S.length()];

		for (int i = 0; i < S.length(); i++) {
			arr[i] = S.substring(i);
		}

		Arrays.sort(arr);

		for (String s : arr) {
			System.out.println(s);
		}
	}
}
