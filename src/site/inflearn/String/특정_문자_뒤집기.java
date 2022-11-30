package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정_문자_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();

        int l = 0;
        int r = str.length - 1;
        while (l < r){
            if(!Character.isAlphabetic(str[l])){
                l++;
            } else if(!Character.isAlphabetic(str[r])){
                r--;
            } else{
                char swap = str[l];
                str[l] = str[r];
                str[r] = swap;
                l++;
                r--;
            }
        }

        System.out.println(String.valueOf(str));
    }
}
