package bj.bj1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Vector<Integer> v = new Vector<>();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(st.nextToken());
            v.add(temp);
        }
        Collections.sort(v);

        int count=0;
        int i=0;
        int j=n-1;
        while(i<j){
            if(v.get(i) + v.get(j) > m){
                j--;
            }
            else if(v.get(i) + v.get(j) < m){
                i++;
            }
            else{
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }
}
