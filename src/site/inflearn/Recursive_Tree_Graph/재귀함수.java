package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        recursive(N);
    }

    public static void recursive(int N){
        if(N == 0){
            return;
        }else{
            recursive(N - 1);
            System.out.print(N + " ");
        }
    }
}
