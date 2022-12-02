package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위_바위_보 {
    public static final String A_WIN = "A";
    public static final String B_WIN = "B";
    public static final String SAME = "D";
    public static final int ROCK = 2;
    public static final int SCISSOR = 1;
    public static final int PAPER = 3;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st2.nextToken());

            if(A == B){
                System.out.println(SAME);
            }else if(A == ROCK && B == SCISSOR){
                System.out.println(A_WIN);
            }else if(A == SCISSOR && B == PAPER){
                System.out.println(A_WIN);
            }else if(A == PAPER && B == ROCK){
                System.out.println(A_WIN);
            }else{
                System.out.println(B_WIN);
            }
        }
    }
}
