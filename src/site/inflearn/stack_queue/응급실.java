package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 응급실 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Queue<Patient> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        int result = 0;

        for(int i = 0; i < N; i++){
            queue.offer(new Patient(i, Integer.parseInt(st.nextToken())));
        }

        while(true){//환자의 순서와 M이 같으면 break로 나올 것
            Patient tmp = queue.poll();
            for (Patient x : queue) {
                if(x.getDanger() > tmp.getDanger()){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!= null){
                result++;
                if(tmp.getSequence() == M){
                    break;
                }
            }
        }

        System.out.println(result);
    }

    public static class Patient{
        private int sequence;
        private int danger;

        public Patient(int sequence, int danger) {
            this.sequence = sequence;
            this.danger = danger;
        }

        public int getSequence() {
            return sequence;
        }

        public int getDanger() {
            return danger;
        }
    }
}


