import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0 ; i < 3 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int total = N * N * N;
        int count = 0;
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                for(int k = 1 ; k <= N ; k++){
                    if(Math.abs(i - arr[0]) > 2 && Math.abs(j - arr[1]) > 2 && Math.abs(k - arr[2]) > 2){
                        count++;
                    }
                }
            }
        }

        System.out.println(total - count);
    }
}