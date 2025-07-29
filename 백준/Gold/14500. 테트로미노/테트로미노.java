import java.util.*;
import java.io.*;
//백준 - 테트로미노
public class Main{
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    static int answer = 0;
    static int N, M;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0  ; j < M ; j++){
                dfs(i, j, 0, 0);
                checkExtraShape(i, j);
            }
        }

        System.out.println(answer);
    }

    static void dfs(int x, int y, int depth, int sum){
        if(depth == 4){
            answer = Math.max(answer, sum);
            return;
        }

        for(int i = 0 ; i < 4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny, depth+1, sum + arr[nx][ny]);
                visited[nx][ny] = false;
            }
        }
    }

    static void checkExtraShape(int x, int y){
        //ㅏ
        if(x >= 0 && x + 1 < N && y - 1 >= 0 && y + 1 < M ){
            int temp = arr[x][y] + arr[x][y-1] + arr[x+1][y] + arr[x][y+1];
            answer = Math.max(temp, answer);
        }

        //ㅗ
        if(x - 1 >= 0 && x + 1 < N && y >= 0 && y + 1 < M){
            int temp = arr[x][y] + arr[x-1][y] + arr[x+1][y] + arr[x][y+1];
            answer = Math.max(temp, answer);
        }
        //ㅓ
        if(x - 1 >= 0 && x < N && y - 1 >= 0 && y + 1 < M){
            int temp = arr[x][y] + arr[x-1][y] + arr[x][y-1] + arr[x][y+1];
            answer = Math.max(temp, answer);
        }
        //ㅜ
        if(x - 1 >= 0 && x + 1 < N && y - 1 >= 0 && y < M){
            int temp = arr[x][y] + arr[x-1][y] + arr[x+1][y] + arr[x][y-1];
            answer = Math.max(temp, answer);
        }
    }
}
