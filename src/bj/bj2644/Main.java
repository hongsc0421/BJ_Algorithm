package bj.bj2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int res=-1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];

        st = new StringTokenizer(br.readLine());
        int find1 = Integer.parseInt(st.nextToken());
        int find2 = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph[parent].add(child);
            graph[child].add(parent);
        }

        dfs(find1, find2, 0);
        System.out.println(res);
    }

    public static void dfs(int start, int end, int count){
        if(start == end){
            res = count;
        }

        visited[start] = true;
        for(int i=0;i<graph[start].size();i++){
            int next = graph[start].get(i);
            if(!visited[next]){
                dfs(next, end, count+1);
            }
        }
    }
}
