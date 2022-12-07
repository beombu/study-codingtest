package site.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            for(int j = str.length() -1; j >= 0; j--){
                sb.append(str.charAt(j));
            }

            System.out.println(sb);
        }
    }
}
