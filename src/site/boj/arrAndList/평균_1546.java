package site.boj.arrAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균_1546 {
    public static final double AVG = 100;
    public static double sum = 0;
    public static double max = Double.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Double[] record = new Double[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < record.length; i++){
            double value = Double.parseDouble(st.nextToken());
            max = Math.max(max, value);
            record[i] = value;
        }

        getSum(record);

        System.out.println(sum / N);
    }

    private static void getSum(Double[] record) {
        for(double a : record){
            sum += a / max * AVG;
        }
    }
}
