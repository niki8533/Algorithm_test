import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = i + 1 ; j < N ; j++){
                int sum = 0;
                for(int k = 0 ; k < N ; k++){
                    if(k == i || k == j) continue;

                    sum += arr[k];
                }

                min = Math.min(min, Math.abs(S - sum));
            }
        }

        System.out.println(min);
    }
}