package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();
        String answer = "";

        for(char x : str){
            if(Character.isUpperCase(x)){
                answer += Character.toLowerCase(x);
            }else{
                answer += Character.toUpperCase(x);
            }
        }

        System.out.println(answer);
    }
}
