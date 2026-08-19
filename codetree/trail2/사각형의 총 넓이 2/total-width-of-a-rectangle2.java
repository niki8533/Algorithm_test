import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[201][201];
        int offset = 100;
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = x1 ; j < x2 ; j++){
                for(int k = y1 ; k < y2 ; k++){
                    arr[j + offset][k + offset]++;
                }
            }
        }

        int answer = 0;
        for(int i = 0 ; i < 201 ; i++){
            for(int j = 0 ; j < 201 ; j++){
                if(arr[i][j] >= 1){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}