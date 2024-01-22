package bj.bj12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count[] = new int[n+1];
        int before[] = new int[n+1];

        count[1] = 0;
        for(int i=2; i<=n; i++) {
            count[i] = count[i-1]+1;
            before[i] = i-1;

            if (i%3 == 0 && count[i/3]+1 < count[i]) {
                count[i] = count[i/3]+1;
                before[i] = i/3;
            }
            if (i%2 == 0 && count[i/2]+1 < count[i]) {
                count[i] = count[i/2]+1;
                before[i] = i/2;
            }
        }
        System.out.println(count[n]);

        StringBuffer sb = new StringBuffer();
        while(n > 0){
            sb.append(n);
            sb.append(" ");
            n = before[n];
        }

        System.out.print(sb.toString());

    }
}
