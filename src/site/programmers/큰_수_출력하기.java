package site.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 큰_수_출력하기 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		String[] arr = br.readLine().split(" ");

		List<Integer> list = new ArrayList<>();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {
			int num = Integer.parseInt(arr[i]);
			if (num > max) {
				list.add(num);
			}
			max = num;
		}

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

	}
}
