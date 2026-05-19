import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        int high = 0;
        int low = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            
            low = Math.min(low, arr[i][0]);
            high = Math.max(high, arr[i][1]);
        }

        int max = 0;
        for(int i = low - 1 ; i <= high ; i++){
            int sum = 0;
            for(int j = 0 ; j < N ; j++){
                if(i < arr[j][0]){
                    sum += C;
                } else if(i >= arr[j][0] && i <= arr[j][1]){
                    sum += G;
                } else if(i > arr[j][1]){
                    sum += H;
                }
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}