package site.inflearn.자바_알고리즘_입문.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정_설계 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String requiredSubjects = br.readLine();
		String subjects = br.readLine();

		String result = solution(requiredSubjects, subjects);
		System.out.println(result);
	}

	private static String solution(String requiredSubjects, String subjects) {
		Queue<Character> queue = new LinkedList<>();

		for (int i = 0; i < requiredSubjects.length(); i++) {
			queue.add(requiredSubjects.charAt(i));
		}

		for (int i = 0; i < subjects.length(); i++) {
			char ch = subjects.charAt(i);

			if (queue.contains(ch) && queue.poll() != ch) { //필수 과목인데 순서가 아닌경우
				return "NO";
			}
		}

		if (!queue.isEmpty()) {
			return "NO";
		}

		return "YES";
	}
}
