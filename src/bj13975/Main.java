package bj13975;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            PriorityQueue<Long> pq = new PriorityQueue<>();
            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<num;j++){
                pq.add(Long.parseLong(st.nextToken()));
            }
            long sum=0;
            while(pq.size() > 1){
                Long a = pq.poll();
                Long b = pq.poll();
                sum += a+b;
                pq.add(a+b);
            }
            sb.append(sum);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
