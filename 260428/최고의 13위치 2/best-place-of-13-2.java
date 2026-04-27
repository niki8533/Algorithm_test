import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for(int r1 = 0 ; r1 < N ; r1++){
            int count = 0;
            for(int c1 = 0 ; c1 < N - 2 ; c1++){
                for(int r2 = 0 ; r2 < N ; r2++){
                    for(int c2 = 0 ; c2 < N - 2 ; c2++){
                        if(r1 == r2){
                            if(c1 + 2 < c2 || c2 + 2 < c1){
                                max = Math.max(max, arr[r1][c1] + arr[r1][c1+1] + arr[r1][c1+2] + arr[r2][c2] + arr[r2][c2+1] + arr[r2][c2+2]);
                            }
                        }
                        else if(r1 != r2){
                            max = Math.max(max, arr[r1][c1] + arr[r1][c1+1] + arr[r1][c1+2] + arr[r2][c2] + arr[r2][c2+1] + arr[r2][c2+2]);
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}