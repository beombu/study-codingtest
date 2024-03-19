package site.inflearn.자바_알고리즘_입문.해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class K번쨰_큰_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int result = -1;
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int l = j + 1; l < N; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}

		int cnt = 0;
		for (int x : set) {
			cnt++;
			if (cnt == K) {
				result = x;
				break;
			}
		}

		System.out.println(result);
	}
}
