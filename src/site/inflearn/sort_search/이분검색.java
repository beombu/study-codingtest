package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이분검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int target = binarySearch(M, arr);

        System.out.println(target);
    }

    private static int binarySearch(int M, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int target = 0;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == M){
                target = mid + 1;
                break;
            }else if(arr[mid] > M){//중간값이 M보다 크면
                right = mid - 1;//미드는 위에서 아닌 것을 알기에 미드를 제외한(-1) 값으로 범위 수정
            }else{
                left = mid + 1;
            }
        }
        return target;
    }
}
