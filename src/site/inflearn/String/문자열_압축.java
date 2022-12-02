package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb= new StringBuilder();
        int strCnt = 1;
        char[] chArr = str.toCharArray();

        for(int i = 0; i < chArr.length - 1; i++){
            if(chArr[i] == chArr[i + 1] && chArr.length - 2 == i){
                strCnt++;
                sb.append(chArr[i + 1]);
                sb.append(strCnt);
                break;
            }
            if(chArr[i] != chArr[i + 1] && chArr.length - 2 == i){
                sb.append(chArr[i]).append(strCnt).append(chArr[i + 1]);
                break;
            }

            if(chArr[i] == chArr[i + 1]){
                strCnt++;
            }else{
                sb.append(chArr[i]);
                if(strCnt > 1){
                    sb.append(strCnt);
                    strCnt = 1;
                }
            }
        }

        System.out.println(sb);
    }
}
