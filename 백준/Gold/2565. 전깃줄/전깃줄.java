import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        dp = new Integer[N];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int max = 0;

        for(int i = 0 ; i < N ; i++){
            max = Math.max(recur(i), max);
        }

        System.out.println(N - max);

    }

    static int recur(int N){
        if(dp[N] == null){
            dp[N] = 1;

            for(int i = N + 1 ; i < dp.length ; i++){
                if(arr[N][1] < arr[i][1]){
                    dp[N] = Math.max(dp[N], recur(i) + 1);
                }
            }
        }

        return dp[N];
    }
}
