package bj2343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] lesson = new int[n];
        int start = 0;
        int end =0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            lesson[i] = Integer.parseInt(st.nextToken());
            if(start < lesson[i]) {
                start = lesson[i];
            }
            end += lesson[i];
        }
        while(start <= end) {
            int middle = (start + end)/2;
            int sum =0;
            int count =0;
            for(int i=0; i<n; i++) {
                if(sum + lesson[i] > middle) {
                    count++;
                    sum =0;
                }
                sum += lesson[i];
            }

            if(sum != 0){
                count++;
            }
            if(count > m){
                start = middle +1;
            }
            else{
                end = middle -1;
            }
        }
        System.out.println(start);
    }
}
