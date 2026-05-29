import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);


        int max = 1;
        for(int i = 0 ; i < N ; i++){
            for(int j = i + 1 ; j < N ; j++){
                if(Math.abs(arr[i] - arr[j]) <= K){
                    max = Math.max(max, ((j - i) + 1));
                }
            }
        }

        System.out.println(max);
    }
}