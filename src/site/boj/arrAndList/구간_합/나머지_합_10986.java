package site.boj.arrAndList.구간_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정답 풀이 : https://girawhale.tistory.com/125
public class 나머지_합_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < arr.length; i++){
            int sum1 = arr[i];
            for(int j = 1; j < arr.length; j++){
                sum1 += arr[j];
                if(sum1 % M == 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
