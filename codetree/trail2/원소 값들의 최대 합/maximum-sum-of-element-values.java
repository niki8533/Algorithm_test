import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for(int i = 1 ; i <= N ; i++){
            int temp = arr[i];
            int sum = temp;            
            for(int j = 1 ; j < M ; j++){
                temp = arr[temp];
                sum += temp;
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}