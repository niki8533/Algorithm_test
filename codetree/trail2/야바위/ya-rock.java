import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        boolean[] cup = new boolean[4];
        for(int i = 1 ; i <= 3 ; i++){
            int count = 0;
            for(int j = 0 ; j < 3 ; j++){
                if(i == j){
                    cup[j] = true;
                } else cup[j] = false;
            }

            for(int j = 0 ; j < N ; j++){
                cup[arr[j][0]] = !cup[arr[j][0]];
                cup[arr[j][1]] = !cup[arr[j][1]];

                if(cup[arr[j][2]]){
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}