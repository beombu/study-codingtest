package site.boj.arrAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i < sumArr.length; i++){
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[endIndex] - sumArr[startIndex - 1]);
        }
    }
}
