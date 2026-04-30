import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());

            if(st.nextToken().equals("G")){
                arr[i][1] = 1;
            } else arr[i][1] = 2;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int max = 0;
        for(int i = 0 ; i < N - 1 ; i++){
            int g = 0;
            int h = 0;
            for(int j = i ; j < N ; j++){
                if(arr[j][1] == 1){
                    g++;
                } else h++;

                if(g == h || g == 0 || h == 0){
                    max = Math.max(max, arr[j][0] - arr[i][0]);
                }
            }
        }

        System.out.println(max);
    }
}