package bj.bj2141;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static Pair[] pair;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        pair = new Pair[n];
        long total = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            pair[i] = new Pair(a, b);
            total += b;
        }

        Arrays.sort(pair);
        long sum=0;

        for(int i=0;i<n;i++){
            sum += pair[i].num;
            if(sum >= (total+1)/2){
                System.out.println(pair[i].pos);
                break;
            }
        }


    }

    static class Pair implements Comparable<Pair>{
        long pos;
        long num;
        public Pair(long a, long b){
            super();
            pos = a;
            num = b;
        }

        @Override
        public int compareTo(Pair p){
            return (int) (this.pos - p.pos);
        }
    }
}
