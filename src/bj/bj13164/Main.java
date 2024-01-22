package bj.bj13164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        int[] child = new int[n];
        token = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            child[i] = Integer.parseInt(token.nextToken());
        }

        int[] gab = new int[n-1];
        for(int i=0;i<n-1;i++){
            gab[i] = child[i+1] - child[i];
        }
        Arrays.sort(gab);

        int result=0;
        for(int i=0;i<n-k;i++){
            result += gab[i];
        }

        System.out.println(result);
    }
}
