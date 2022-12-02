package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 보이는_학생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt = 1;
        int preNum = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()){
            int nowNum = Integer.parseInt(st.nextToken());

            if(preNum < nowNum){
                cnt++;
                preNum = nowNum;
            }
        }

        System.out.println(cnt);
    }
}
