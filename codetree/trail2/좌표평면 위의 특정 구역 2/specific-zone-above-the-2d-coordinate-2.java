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
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            int minWidth = Integer.MAX_VALUE;
            int maxWidth = Integer.MIN_VALUE;

            int minHeight = Integer.MAX_VALUE;
            int maxHeight = Integer.MIN_VALUE;
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    continue;
                }

                minWidth = Math.min(minWidth, arr[j][0]);
                maxWidth = Math.max(maxWidth, arr[j][0]);

                minHeight = Math.min(minHeight, arr[j][1]);
                maxHeight = Math.max(maxHeight, arr[j][1]);
            }

            min = Math.min(min, (maxWidth - minWidth) * (maxHeight - minHeight));
        }

        System.out.println(min);
    }
}