package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱_난쟁이 {
    public final static int TOTAL_HEIGHT = 100;

    public static int[] arr = new int[9];
    public static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            int height = Integer.parseInt(br.readLine());
            arr[i] = height;
            sum += height;
        }

        Arrays.sort(arr);
        getPeople();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) continue;

            System.out.println(arr[i]);
        }
    }

    private static void getPeople() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == TOTAL_HEIGHT) {
                    arr[i] = 0;
                    arr[j] = 0;
                    return;
                }
            }
        }
    }
}
