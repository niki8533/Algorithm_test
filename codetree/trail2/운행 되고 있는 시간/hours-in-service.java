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

        int max = 0;
        for(int i = 0 ; i < N ; i++){
            int[] temp = new int[1001];
            int count = 0;
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    continue;
                }

                for(int k = arr[j][0] ; k < arr[j][1] ; k++){
                    temp[k]++;
                }
            }

            for(int k = 0 ; k < 1001 ; k++){
                if(temp[k] > 0){
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}