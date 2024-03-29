package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_압축 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();

		int count = 1; //반복 횟수
		char prev = 0; //반복 문자

		for (int i = 0; i < s.length(); i++) {
			//직전의 문자와 같은 문자라면
			if (prev == s.charAt(i)) {
				count++;
				continue;
			}

			//직전에 반복되는 문자가 있었다면, 문자의 개수를 문자열에 추가
			if (count > 1) {
				sb.append(count);
			}

			sb.append(s.charAt(i));
			prev = s.charAt(i);
			count = 1;
		}

		//마지막까지 반복된 문자가 있을 수 있기때문에
		if (count > 1) {
			sb.append(count);
		}

		System.out.println(sb);
	}
}
