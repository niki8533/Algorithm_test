import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
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
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N - 2 ; j++){
                max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
            }
        }

        System.out.println(max);
    }
}