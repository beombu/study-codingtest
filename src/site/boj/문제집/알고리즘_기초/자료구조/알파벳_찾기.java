package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int arr[] = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}
