package site.inflearn.자바_알고리즘_입문.문자열;

import java.util.Scanner;

public class 문자_찾기 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next().toLowerCase();
		String input2 = in.next().toLowerCase();
		int count = 0;

		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == input2.charAt(0)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
