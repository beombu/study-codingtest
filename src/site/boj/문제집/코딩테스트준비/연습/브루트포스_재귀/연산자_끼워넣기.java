package site.boj.문제집.코딩테스트준비.연습.브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기 {
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int N;
    static int[] numArr;//숫자 배열
    static int[] operatorArr = new int[4];//연산자 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operatorArr.length; i++) {
            operatorArr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(1, numArr[0]);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    /**
     * 재귀 함수
     * @param dep : 주어진 숫자배열의 idx, 재귀의 기준
     * @param result : 중간 값
     */
    private static void DFS(int dep, int result){
        if(dep == N){//마지막 숫자에 도착하면
            MAX = Math.max(MAX, result);
            MIN = Math.min(MIN, result);
            return;
        }

        for (int i = 0; i < operatorArr.length; i++) {
            if(operatorArr[i] > 0){
                operatorArr[i]--;
                calc(dep, result, i);
                operatorArr[i]++;
            }
        }
    }

    private static void calc(int dep, int result, int i) {
        switch (i){
            case 0:
                DFS(dep + 1, result + numArr[dep]);
                break;
            case 1:
                DFS(dep + 1, result - numArr[dep]);
                break;
            case 2:
                DFS(dep + 1, result * numArr[dep]);
                break;
            case 3:
                DFS(dep + 1, result / numArr[dep]);
                break;
        }
    }
}
