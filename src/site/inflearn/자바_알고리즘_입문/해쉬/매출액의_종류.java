package site.inflearn.자바_알고리즘_입문.해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class 매출액의_종류 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		List<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < K - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int left = 0;

		for (int i = K - 1; i < N; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			result.add(map.size());

			map.put(arr[left], map.getOrDefault(arr[left], 0) - 1);
			if (map.get(arr[left]) == 0) {
				map.remove(arr[left]);
			}

			left++;
		}

		for (int a : result) {
			System.out.print(a + " ");
		}
	}
}
