import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <= arr[0][1] / 2 ; i++){
            boolean isIn = true;
            int temp = i;
            for(int j = 0 ; j < N ; j++){
                temp *= 2;
                
                if(arr[j][0] > temp || temp > arr[j][1]){
                    isIn = false;
                    break;
                }
            }

            if(isIn){
                min = Math.min(min, i);
            }
        }

        System.out.println(min);
    }
}