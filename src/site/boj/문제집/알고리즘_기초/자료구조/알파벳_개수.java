package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int[] arr = new int[26];

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			arr[c - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
