package site.inflearn.자바_알고리즘_입문.해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String result = "YES";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);

			if (!map.containsKey(ch)) {
				result = "NO";
				break;
			} else {
				int num = map.get(ch);
				if (num == 0) {
					result = "NO";
					break;
				}

				map.put(ch, map.get(ch) - 1);
			}
		}

		System.out.println(result);
	}
}
