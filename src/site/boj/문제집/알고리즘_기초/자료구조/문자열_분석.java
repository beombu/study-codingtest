package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S;

		while ((S = br.readLine()) != null) {
			int[] arr = new int[4];

			for (int i = 0; i < S.length(); i++) {
				char ch = S.charAt(i);

				if (Character.isLowerCase(ch)) {
					arr[0]++;
				}
				if (Character.isUpperCase(ch)) {
					arr[1]++;
				}
				if (Character.isDigit(ch)) {
					arr[2]++;
				}
				if (ch == ' ') {
					arr[3]++;
				}
			}

			sb.append(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + "\n");
		}

		System.out.print(sb);
	}
}
