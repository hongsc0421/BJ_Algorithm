package bj17615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ball = br.readLine();
        int count = Integer.MAX_VALUE;

        int this_count=0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(ball.charAt(i) == 'R'){
                flag = true;
            }
            if(ball.charAt(i) == 'B' && flag){
                this_count++;
            }
        }
        count = Math.min(count, this_count);

        this_count = 0;
        flag = false;
        for(int i=0;i<n;i++){
            if(ball.charAt(i) == 'B'){
                flag = true;
            }
            if(ball.charAt(i) == 'R' && flag){
                this_count++;
            }
        }
        count = Math.min(count, this_count);

        this_count = 0;
        flag = false;
        for(int i=n-1;i>=0;i--){
            if(ball.charAt(i) == 'R'){
                flag = true;
            }
            if(ball.charAt(i) == 'B' && flag){
                this_count++;
            }
        }
        count = Math.min(count, this_count);

        this_count = 0;
        flag = false;
        for(int i=n-1;i>=0;i--){
            if(ball.charAt(i) == 'B'){
                flag = true;
            }
            if(ball.charAt(i) == 'R' && flag){
                this_count++;
            }
        }
        count = Math.min(count, this_count);

        System.out.println(count);

    }
}
