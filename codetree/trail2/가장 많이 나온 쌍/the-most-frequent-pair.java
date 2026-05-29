import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][2];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            } else return o1[0] - o2[0];
        });

        int max = 0;
        int count = 1;
        for(int i = 0 ; i < M - 1 ; i++){
            if(arr[i][0] != arr[i+1][0] || arr[i][1] != arr[i][1]){
                max = Math.max(max, count);
                count = 1;
            } else count++;
        }

        System.out.println(max);
    }
}