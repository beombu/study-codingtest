package site.inflearn.자바_알고리즘_입문.문자열;

import java.util.Scanner;

public class 대소문자_변환 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		System.out.println(solution(input));
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(Character.toUpperCase(ch));
			}
		}

		return sb.toString();
	}
}
