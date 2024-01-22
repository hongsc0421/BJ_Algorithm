package bj.bj3474;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int res=0;

        for(int i=0;i<n;i++){
            long num = Long.parseLong(br.readLine());
            for(int j=5;j<=num;j*=5){
                res += num/j;
            }
            sb.append(res);
            sb.append("\n");
            res=0;
        }

        System.out.println(sb);


    }
}
