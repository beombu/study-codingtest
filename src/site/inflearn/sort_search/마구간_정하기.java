package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 마구간_정하기 {
    public static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int answer = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[N - 1];

        while(lt <= rt){
            int mid  = (lt + rt) / 2;

            if(count(arr, mid) >= C){
                answer = mid;
                lt = mid + 1;
            }else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
