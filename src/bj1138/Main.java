package bj1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int n = Integer.parseInt(br.readLine());
        int[] res = new int[n];
        boolean[] full = new boolean[n];
        st = new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            int count=0;
            int k = Integer.parseInt(st.nextToken());
            count = 0;
            while(true){
                if(k==0 && !full[count]){
                    res[count] = i;
                    full[count] = true;
                    break;
                }
                else if(!full[count]) k--;
                count++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }

    }
}
