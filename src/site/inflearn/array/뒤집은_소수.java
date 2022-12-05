package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 뒤집은_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int reverseNum = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
            if(isPrime(reverseNum)){
                arrayList.add(reverseNum);
            }
            sb.setLength(0);//초기화
        }

        for(int i : arrayList){
            System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int reverseNum){
        if(reverseNum < 2){
            return false;
        }

        if(reverseNum == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(reverseNum); i++){
            if(reverseNum % i == 0){
                return false;
            }
        }

        return true;
    }
}
