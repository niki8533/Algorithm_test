import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N - 1 ; j++){
                for(int k = j + 1 ; k < N ; k++){
                    if(j == i || k == i){
                        continue;
                    }

                    int distance = (int)(Math.pow(Math.abs(arr[j][0] - arr[k][0]), 2) + Math.pow(Math.abs(arr[j][1] - arr[k][1]), 2));
                    min = Math.min(min, distance);
                }
            }
        }

        System.out.println(min);
    }
}