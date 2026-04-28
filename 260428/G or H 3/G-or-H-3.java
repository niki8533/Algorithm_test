import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            if(st.nextToken().equals("G")) {
                arr[i][1] = 1;
            } else arr[i][1] = 2;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int max = 0;
        for(int i = 0 ; i < N - 1 ; i++){
            int sum = arr[i][1];
            for(int j = i + 1 ; j < N ; j++){
                sum += arr[j][1];
                if(arr[j][0] - arr[i][0] <= K){
                    max = Math.max(max, sum);
                }
            }
        }

        if(N == 1){
            max = arr[0][1];
        }

        System.out.println(max);
    }
}