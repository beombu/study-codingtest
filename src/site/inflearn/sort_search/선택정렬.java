package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 선택정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        selectSort(N, arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    private static void selectSort(int N, int[] arr) {
        for(int i = 0; i < N; i++){
            int minIdx = i;

            for(int j = i + 1; j < N; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
    }

    private static void swap(int[] arr, int i, int minIdx) {
        int tmp = 0;
        tmp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = tmp;
    }
}
