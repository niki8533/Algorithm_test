import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {0, 0, 1, -1, 0, 1, 0, -1};
    static int[] dy = {1, -1, 0, 0, 1, 0, 1, 0};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[19][19];
        visited = new boolean[19][19];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < 19 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 19 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;

        for(int i = 0 ; i < 19 ; i++){
            for(int j = 0 ; j < 19 ; j++){
                if(arr[i][j] == 0)
                    continue;

                for(int d = 0 ; d < 8 ; d++){
                    count = 1;
                    int x = i;
                    int y = j;
                    while(true){
                        int nx = x + dx[d];
                        int ny = y + dy[d];

                        if(nx >= 0 && nx < 19 && ny >= 0 && ny < 19 && arr[nx][ny] == arr[x][y]){
                            count++;
                            x = nx;
                            y = ny;
                        } else break;
                    }

                    if(count == 5){
                       System.out.println(arr[i][j]);
                        System.out.print((i + 2 * dx[d] + 1) + " " + (j + 2 * dy[d] + 1));
                        System.exit(0);
                    }
                }
            }
        }

        System.out.print(0);

    }
}