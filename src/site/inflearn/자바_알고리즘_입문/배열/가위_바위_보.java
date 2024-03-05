package site.inflearn.자바_알고리즘_입문.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 가위_바위_보 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Queue<Integer> aList = new LinkedList<>();
		Queue<Integer> bList = new LinkedList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			aList.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			bList.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < N; i++) {
			int a = aList.poll();
			int b = bList.poll();

			if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
				System.out.println("A");
			} else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
				System.out.println("B");
			} else {
				System.out.println("D");
			}
		}
	}
}
