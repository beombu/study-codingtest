package site.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {
    public static final int PASSWORD_LENGTH = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                sb.append(1);
            }else if(str.charAt(i) == '*'){
                sb.append(0);
            }
            if((i + 1) % PASSWORD_LENGTH == 0){
                strArr[cnt] = sb.toString();
                sb.setLength(0);
                cnt++;
            }
        }

        sb = new StringBuilder();

        for(String s : strArr){
            int num = Integer.valueOf(s, 2);
            char ch = (char) num;
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
