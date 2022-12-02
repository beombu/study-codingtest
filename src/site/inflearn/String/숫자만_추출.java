package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }
        int result = Integer.parseInt(newStr);
        System.out.println(result);
    }
}
