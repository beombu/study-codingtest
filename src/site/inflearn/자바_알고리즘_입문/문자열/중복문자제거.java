package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 중복문자제거 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<Character> set = new HashSet<>();
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				continue;
			} else {
				set.add(ch);
				sb.append(ch);
			}
		}

		System.out.println(sb);
	}
}
