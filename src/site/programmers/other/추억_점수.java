package site.programmers.other;

import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {
	private static Map<String, Integer> friendScore;

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		mapping(name, yearning);

		for (int i = 0; i < photo.length; i++) {

			for (int j = 0; j < photo[i].length; j++) {
				String friend = photo[i][j];

				if (friendScore.containsKey(friend)) {
					answer[i] += friendScore.get(friend);
				}
			}
		}

		return answer;
	}

	public static void mapping(String[] name, int[] yearning) {
		friendScore = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			friendScore.put(name[i], yearning[i]);
		}
	}
}
