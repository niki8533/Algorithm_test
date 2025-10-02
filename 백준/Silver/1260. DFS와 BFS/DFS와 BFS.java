import java.util.*;
import java.io.*;

public class Main {
    static int N, V, M;
    static int[][] arr;
    static boolean[] visited;

    static Queue<Integer> q = new LinkedList<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visited = new boolean[N];

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(V-1);
        sb.append("\n");
        visited = new boolean[N];
        bfs(V-1);

        System.out.println(sb);
    }

    public static void dfs(int start){
        visited[start] = true;
        sb.append((start + 1)).append(" ");

        for(int i = 0 ; i < N ; i++){
            if(arr[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append((start + 1)).append(" ");

            for(int i = 0 ; i < N ; i++){
                if(arr[start][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
