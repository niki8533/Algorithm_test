import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for(int i = 0 ; i < N - 2 ; i++){
            for(int j = 0 ; j < N ; j++){
                if(j != i - 1 && j != i && j != i+1)
                    max = Math.max(max, arr[i] + arr[j]);
            }
        }

        System.out.println(max);
    }
}