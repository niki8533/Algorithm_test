import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[101];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int j = x1 ; j <= x2 ; j++){
                arr[j]++;
            }
        }

        int max = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(arr[i] == 0) continue;

            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}