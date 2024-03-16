package site.inflearn.자바_알고리즘_입문.해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 모든_아나그램_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int result = 0;

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
		}

		if (map1.equals(map2)) {
			result++;
		}

		int left = 0;
		for (int right = str2.length(); right < str1.length(); right++) {
			map1.put(str1.charAt(right), map1.getOrDefault(str1.charAt(right), 0) + 1);
			map1.put(str1.charAt(left), map1.get(str1.charAt(left)) - 1);

			if (map1.get(str1.charAt(left)) == 0) {
				map1.remove(str1.charAt(left));
			}

			if (map1.equals(map2)) {
				result++;
			}

			left++;
		}

		System.out.println(result);
	}
}
