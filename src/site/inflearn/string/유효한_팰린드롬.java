package site.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String newStr = "";
        String result = "YES";

        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }

        String reverseStr = new StringBuilder(newStr).reverse().toString();
        if(!newStr.equalsIgnoreCase(reverseStr)){
            result = "NO";
        }

        System.out.println(result);
    }
}
