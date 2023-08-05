package bj11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int n;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int count=0;

        tk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0;i<m;i++){
            tk = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(tk.nextToken());
            int v = Integer.parseInt(tk.nextToken());

            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for(int i=1;i<=n;i++){
            if(!visited[i]){
                DFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void DFS(int idx){
        if(visited[idx]){
            return;
        }

        visited[idx] = true;
        for(int i=1;i<=n;i++){
            if(graph[idx][i] == 1){
                DFS(i);
            }
        }
    }
}
