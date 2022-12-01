package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "NO";
        String str = br.readLine();
        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(reverseStr)){
            result = "YES";
        }

        System.out.println(result);

    }
}
