package site.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장_속_단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";

        String[] str = br.readLine().split(" ");

        for(String i : str){
            if(result.length() < i.length()){
                result = i;
            }
        }

        System.out.println(result);
    }
}
