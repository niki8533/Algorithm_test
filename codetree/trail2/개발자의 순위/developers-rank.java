import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[K][N];
        for(int i = 0 ; i < K ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] rank = new int[N+1][N+1];
        for(int i = 0 ; i < K ; i++){
            for(int j = 0 ; j < N-1 ; j++){
                for(int k = j+1 ; k < N ; k++){
                    rank[arr[i][j]][arr[i][k]]++;
                }
            }
        }

        int count = 0;
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                if(rank[i][j] == K){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}