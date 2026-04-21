import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            int temp = 0;
            for(int j = 0 ; j < N ; j++){
                temp = temp + arr[j] * Math.abs(i-j);
            }
            
            min = Math.min(min, temp);
        }

        System.out.println(min);
    }
}