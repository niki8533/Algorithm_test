import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <= 83 ; i++){
            int low = i;
            int high = i + 17;
            int cost = 0;
            for(int j = 0 ; j < N ; j++){
                if(arr[j] < low){
                    cost += (low - arr[j]) * (low - arr[j]);
                } else if(arr[j] > high){
                    cost += (arr[j] - high) * (arr[j] - high);
                }
            }
            min = Math.min(min, cost);
        }
        System.out.println(min);
    }
}