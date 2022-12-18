package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int index = 1; index < arr.length; index++) {
            int target = arr[index];
            int lastIndex = index - 1;

            while (lastIndex >= 0 && target < arr[lastIndex]) {
                arr[lastIndex + 1] = arr[lastIndex];
                lastIndex--;
            }

            arr[lastIndex + 1] = target;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
