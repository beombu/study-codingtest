package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 뮤직비디오 {
    public static int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum + x > capacity){
                cnt++;
                sum = x;
            }else{
                sum+=x;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt+ rt) / 2;
            if(count(arr, mid) <= M){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
