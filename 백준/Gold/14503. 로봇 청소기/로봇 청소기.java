import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 - 로봇 청소기
public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        if(arr[x][y] == 0) {
            arr[x][y] = 2;

            answer++;
        }
        int count = 0;
        while(true){
            boolean cleaned = false;
            for(int i = 0 ; i < 4 ; i++){
                d = ( d + 3 ) % 4;

                int nx = x + dx[d];
                int ny = y + dy[d];

                if(arr[nx][ny] == 0){
                    x = nx;
                    y = ny;
                    arr[x][y] = 2;
                    answer++;
                    cleaned = true;
                    count = 0;
                    break;
                }
            }

            if(!cleaned){
               int back = ( d + 2) % 4;
               int nx = x + dx[back];
               int ny = y + dy[back];

               if(arr[nx][ny] == 1) {
                   break;
               } else {
                   x = nx;
                   y = ny;
               }
            }
        }

        System.out.println(answer);
    }
}
