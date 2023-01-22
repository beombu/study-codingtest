package site.시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신을_모시는_사당 {
    static int left, right, start, end = 0;
    static int N;
    static int[] arr;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        left = 0;
        right = 0;
        start = 0;
        end = 0;

        while(end < N){
            if(arr[start] == arr[end]){//시작과 끝이 같다면
                addEnd();
            }else if(arr[start] == 1 && arr[end] == 2){//시작은 왼, 끝은 오이면
                if(left >= right){//왼쪽의 갯수가 더 크면
                    addEnd();
                }else{
                    left--;
                    start++;
                }
            }else if(arr[start] == 2 && arr[end] == 1){
                if(left > right){
                    right--;
                    start++;
                }else{
                    addEnd();
                }
            }
        }
        answer = Math.max(answer, Math.abs(left - right));
        System.out.println(answer);
    }

    private static void addEnd() {
        if(arr[end] == 1){
            left++;
        }else{
            right++;
        }
        end++;
        answer = Math.max(answer, Math.abs(left - right));
    }
}
