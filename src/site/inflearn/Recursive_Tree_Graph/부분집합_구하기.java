package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부분집합_구하기 {
    static int N;
    static int[] check;

    public static void DFS(int L){
        if(L == N + 1){
            String tmp = "";
            for (int i = 1; i <= N; i++) {
                if(check[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() > 0){
                System.out.println(tmp);
            }
        }else{
            check[L] = 1;
            DFS(L + 1);
            check[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        check = new int[N + 1];

        DFS(1);
    }
}
