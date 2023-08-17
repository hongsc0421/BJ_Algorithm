package bj1743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, k, res, count;
    static boolean[][] map, visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new boolean[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r-1][c-1] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && map[i][j]) {
                    count=0;
                    dfs(i,j);
                    res = Math.max(res, count);
                }
            }
        }
        System.out.println(res);

    }

    private static void dfs(int x, int y) {
        count++;
        visited[x][y]=true;
        for (int k = 0; k < 4; k++) {
            int newx = x+dx[k];
            int newy = y+dy[k];

            if(newx<0 || newy<0 || newx>=n || newy>=m)continue;
            if(!visited[newx][newy] && map[newx][newy]) {
                dfs(newx,newy);
            }
        }
    }
}
