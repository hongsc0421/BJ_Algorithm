package bj1446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<int[]>[] list = new ArrayList[10001];

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for(int i=0; i<list.length; i++) {
            list[i]=new ArrayList<>();
        }

        int res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new int[] {b,c});
        }

        int[] dp = new int[10001];
        for(int i=0; i<dp.length; i++) {
            dp[i] = i;
        }

        for(int i=0; i<=d; i++) {
            if(i != 0)
                dp[i] = Math.min(dp[i-1]+1, dp[i]) ;
            if(list[i].size()>0) {
                for(int tmp[]: list[i]) {
                    int end = tmp[0];
                    int len = tmp[1];
//                    System.out.println(len);
//                    System.out.println(end);
                    if(dp[end] > dp[i]+len) {
                        dp[end] = dp[i]+len;
                    }
                }
            }

        }
        System.out.println(dp[d]);
    }
}
