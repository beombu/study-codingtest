package site.inflearn.자바_알고리즘_입문.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_짧은_문자거리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String s = st.nextToken();
		char t = st.nextToken().charAt(0);
		int[] arr = new int[s.length()];
		int distance = 1000;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				distance = 0;
				arr[i] = distance;
			} else {
				distance++;
				arr[i] = distance;
			}
		}

		distance = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == t) {
				distance = 0;
				arr[i] = distance;
			} else {
				distance++;
				arr[i] = Math.min(arr[i], distance);
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
