package site.boj.문제집.구현;

public class 셀프_넘버 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for (int i = 1; i <= 10000; i++) {
			int num = selfNumber(i);
			arr[num] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			if (!arr[i]) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb);
	}

	public static int selfNumber(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		if (sum <= 10000) {
			return sum;
		}

		return 0;
	}
}
