package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class 리모컨 {
    public static int chanel = 100;
    public static int N;
    public static int M;
    public static List<Integer> button = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    public static int max = Integer.MAX_VALUE;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String strN = br.readLine();
        String[] arrN = strN.split("");
        N = Integer.parseInt(strN);
        M = Integer.parseInt(br.readLine());
        if (M != 0) {
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                Integer brokenButton = Integer.parseInt(st.nextToken());
                button.remove(brokenButton);
            }
        }

        if (N == chanel) {
            System.out.println(0);
            return;
        }

        String changeNumberButton = findChangeNumberButton(arrN);
        count += Math.abs(N - Integer.parseInt(changeNumberButton));

        System.out.println(count);
    }

    private static String findChangeNumberButton(String[] arrN) {
        StringBuilder changeNumberButton = new StringBuilder();
        for (int i = 0; i < arrN.length; i++) {
            String nowNum = arrN[i];

            if (button.contains(Integer.parseInt(nowNum))) {
                changeNumberButton.append(nowNum);
            } else {
                int nearNum = 0;

                for (int j = 0; j < button.size(); j++) {
                    if (Math.abs(Integer.parseInt(nowNum) - button.get(j)) < max) {
                        max = Math.abs(Integer.parseInt(nowNum) - button.get(j));
                        nearNum = button.get(j);
                    }
                }

                changeNumberButton.append(nearNum);
            }
            System.out.println(i + "번째 " + changeNumberButton);
            count++;
        }

        return changeNumberButton.toString();
    }
}
