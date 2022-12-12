package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 매출액의_종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int result = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> slidingWindow = new LinkedList<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < K; i++){
            slidingWindow.add(Integer.parseInt(st.nextToken()));
        }

        result = (int) slidingWindow.stream().distinct().count();
        sb.append(result).append(" ");

        for(int i = 0; i < N - K; i++){
            slidingWindow.add(Integer.parseInt(st.nextToken()));
            slidingWindow.poll();
            result = (int) slidingWindow.stream().distinct().count();
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }
}
