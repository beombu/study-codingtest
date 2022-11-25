package site.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 수_정렬하기_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int[] result = new int[testCase];

        for(int i = 0; i < testCase; i++){
            result[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(result);

        for(int i = 0; i < testCase; i++){
            System.out.println(result[i]);
        }
    }
}
