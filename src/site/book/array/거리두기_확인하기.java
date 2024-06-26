package site.book.array;

public class 거리두기_확인하기 {
	private static final int dx[] = {0, -1, 1, 0};
	private static final int dy[] = {-1, 0, 0, 1};

	public int[] solution(String[][] places) {
		int[] answer = new int[5];

		for (int i = 0; i < 5; i++) { //대기실 순회
			String[] place = places[i];
			char[][] room = new char[5][];

			for (int j = 0; j < 5; j++) {
				room[j] = place[j].toCharArray();
			}

			if (isDistanced(room)) {
				answer[i] = 1;
			} else {
				answer[i] = 0;
			}
		}

		return answer;
	}

	public static boolean isDistanced(char[][] room) {
		for (int y = 0; y < room.length; y++) {
			for (int x = 0; x < room[y].length; x++) {
				if (room[y][x] != 'P') {
					continue;
				}

				if (!isDistanced(room, x, y)) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isDistanced(char[][] room, int x, int y) {
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) {
				continue;
			}

			switch (room[ny][nx]) {
				case 'P':
					return false;
				case 'O':
					if (isNextToVolunteer(room, nx, ny, 3 - d)) {
						return false;
					}
					break;
			}
		}

		return true;
	}

	public static boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
		for (int d = 0; d < 4; d++) {
			if (d == exclude) {
				continue;
			}

			int nx = x + dx[d];
			int ny = y + dy[d];
			if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) {
				continue;
			}

			if (room[ny][nx] == 'P') {
				return true;
			}
		}

		return false;
	}
}
