package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 버블_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }

    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int tmp = 0;
        tmp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = tmp;
    }

}
