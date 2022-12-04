package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
    public static boolean[] prime;//소수를 체크할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        makePrime(N);

        for(int i = 0; i < prime.length; i++){
            if(prime[i] == false){//소수일 경우
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    final static void makePrime(int N){
        prime = new boolean[N + 1];

        //2 미만의 N을 입력받으면 소수는 판별할 이유가 없음
        if(N < 2){
            return;
        }

        prime[0] = prime[1] = true;

        //2부터 N의 제곱근까지 반복
        for(int i = 2; i <= Math.sqrt(N); i++){

            //이미 소수가 아닌 것으로 체크되어 있다면 넘어감
            if(prime[i] == true){
                continue;
            }

            //i의 배수들을 하나씩 소수가 아닌 것으로 체크
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}
