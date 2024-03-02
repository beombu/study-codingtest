package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 보이는_학생 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			int height = Integer.parseInt(st.nextToken());

			if (height > max) {
				cnt++;
				max = height;
			}
		}

		System.out.println(cnt);
	}
}
