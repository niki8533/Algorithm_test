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

        int max = 0;
        for(int i = 0 ; i < N ; i++){
            int height = 0;
            int width = 0;
            int extend = 0;
            for(int j = 0 ; j < N ; j++){
                for(int k = 0 ; k < N ; k++){
                    if(arr[i][1] == arr[j][1] && arr[j][0] == arr[k][0]){
                        extend = Math.abs((arr[i][0]*arr[j][1] + arr[j][0]*arr[k][1] + arr[k][0]*arr[i][1])
                                            - (arr[j][0]*arr[i][1] + arr[k][0]*arr[j][1] + arr[i][0]*arr[k][1]));

                    }
                    max = Math.max(max, extend);
                }
            }
        }

        System.out.println(max);
    }
}