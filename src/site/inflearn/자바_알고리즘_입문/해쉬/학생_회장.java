package site.inflearn.자바_알고리즘_입문.해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 학생_회장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		HashMap<Character, Integer> map = new HashMap<>();
		String str = br.readLine();

		for (int i = 0; i < N; i++) {
			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		char result = '0';

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}

		System.out.println(result);
	}
}
