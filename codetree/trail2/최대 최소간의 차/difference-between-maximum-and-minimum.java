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

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int min = Integer.MAX_VALUE;
        for(int a = 1 ; a <= (max+2) ; a++){
            int cost = 0;
            for(int i = 0 ; i < N ; i++){
                if(a <= arr[i] && arr[i] <= a + 2){
                    continue;
                } else if(arr[i] < a){
                    cost += (a - arr[i]);
                } else cost += (arr[i] - (a + 2));
            }

            min = Math.min(min, cost);
        }
        System.out.println(min);
    }
}