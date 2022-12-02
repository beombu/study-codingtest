package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큰_수_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int preNum = Integer.parseInt(st.nextToken());
        sb.append(preNum).append(" ");

        while(st.hasMoreTokens()){
            int nowNum = Integer.parseInt(st.nextToken());

            if(preNum < nowNum){
                sb.append(nowNum).append(" ");
            }
            preNum = nowNum;
        }

        System.out.println(sb);
    }
}
