package bj10552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] change = new int[100001];
    static boolean[] visited = new boolean[100001];
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int fav = Integer.parseInt(st.nextToken());
            int hate = Integer.parseInt(st.nextToken());

            if(change[hate] == 0){
                change[hate] = fav;
            }
        }
        DFS(p);
        System.out.println(count);

    }
    static void DFS(int ch){
        if(visited[ch]){
            count = -1;
        }
        else if(change[ch] != 0){
            visited[ch] = true;
            count++;
            DFS(change[ch]);
        }
    }
}
